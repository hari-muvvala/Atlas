package trainertasks.day26.task1_pubsub;

public class NamedSubscriber implements PubListener {
    private final String displayName;

    public NamedSubscriber(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void onMessage(String message) {
        System.out.println("the user " + displayName + " has received a msg " + message);
    }
}