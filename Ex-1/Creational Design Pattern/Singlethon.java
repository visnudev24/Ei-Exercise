class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void loadConfigurations() {
        System.out.println("Configurations loaded.");
    }
}

public class Singlethon {
    public static void main(String[] args) {
 
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        configManager1.loadConfigurations();

        
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        System.out.println(configManager1 == configManager2); 
    }
}