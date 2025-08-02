package trainertasks.day23;

class Singleton {
    // Step 1: Private static instance (not created yet)
    private static Singleton instance;

    // Step 2: Private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Public static method to return the instance (Lazy Initialization)
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // create only once
        }
        return instance;
    }

    // Step 4: A regular (non-static) method
    public void doSomething() {
        System.out.println("Doing something using Singleton instance");
    }
}

public class Task3_SingletonLazyInit {
    public static void main(String[] args) {
        // First call - creates instance
        Singleton s1 = Singleton.getInstance();
        s1.doSomething();

        // Second call - reuses same instance
        Singleton s2 = Singleton.getInstance();
        s2.doSomething();

        // Check if both references are same
        System.out.println("Are both instances same? " + (s1 == s2));
    }
}