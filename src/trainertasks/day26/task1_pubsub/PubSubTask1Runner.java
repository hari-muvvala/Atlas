package trainertasks.day26.task1_pubsub;

public class PubSubTask1Runner {
    public static void main(String[] args) {
        System.out.println("Pub sub Pattern ");

        SimpleMessageBus bus = new SimpleMessageBus();

        NamedSubscriber s1 = new NamedSubscriber("Prasunamba");
        NamedSubscriber s2 = new NamedSubscriber("Sheerisha DC");
        NamedSubscriber s3 = new NamedSubscriber("Sheerisha Perapagu");
        NamedSubscriber s4 = new NamedSubscriber("Hari Gopal");
        NamedSubscriber s5 = new NamedSubscriber("Arun Kumar");
        NamedSubscriber s6 = new NamedSubscriber("Sarath");

        bus.addListener(s1);
        bus.addListener(s2);
        bus.addListener(s3);
        bus.addListener(s4);
        bus.addListener(s5);
        bus.addListener(s6);

        bus.publish("Good Afternoon every one");
        // Example removal to prove dynamic unsubscribe works:
        bus.removeListener(s6);
        bus.publish("Good Luck to you all for your Milestone");
    }
}