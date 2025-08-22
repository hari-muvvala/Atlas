package trainertasks.day26.task2_singleton;

public class SingletonTask2Runner {
    public static void main(String[] args) {
        AppConfigSingleton a = AppConfigSingleton.getInstance();
        AppConfigSingleton b = AppConfigSingleton.getInstance();

        System.out.println("Same instance? " + (a == b));
        System.out.println("Start ENV: " + a.getEnv());

        a.setEnv("PROD");
        System.out.println("After change via A, ENV seen via B: " + b.getEnv());
    }
}