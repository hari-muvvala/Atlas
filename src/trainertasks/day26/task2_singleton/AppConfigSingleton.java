package trainertasks.day26.task2_singleton;

public class AppConfigSingleton {
    private static volatile AppConfigSingleton INSTANCE;

    // Example config values
    private String env = "DEV";
    private String apiBase = "https://api.example.dev";

    private AppConfigSingleton() {} // prevent new

    public static AppConfigSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (AppConfigSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppConfigSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public String getEnv() { return env; }
    public void setEnv(String env) { this.env = env; }

    public String getApiBase() { return apiBase; }
    public void setApiBase(String apiBase) { this.apiBase = apiBase; }
}