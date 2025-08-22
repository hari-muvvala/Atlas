package trainertasks.day26.task1_pubsub;

import java.util.ArrayList;
import java.util.List;

public class SimpleMessageBus implements PubChannel {
    private final List<PubListener> listeners = new ArrayList<>();

    @Override
    public void addListener(PubListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PubListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListeners(String message) {
        for (PubListener l : listeners) {
            l.onMessage(message);
        }
    }

    // Convenience method
    public void publish(String message) {
        notifyListeners(message);
    }
}