package trainertasks.day26.task1_pubsub;

public interface PubChannel {
    void addListener(PubListener listener);
    void removeListener(PubListener listener);
    void notifyListeners(String message);
}