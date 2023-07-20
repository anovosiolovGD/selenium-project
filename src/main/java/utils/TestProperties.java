package utils;

import org.aeonbits.owner.ConfigFactory;

public class TestProperties {
    private static final ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
    private static final TestProperties propertiesInstance = new TestProperties();
    public static final String homepageUrl = configProperties.homepageUrl();
    public String getProperty(String key) {
        return ConfigFactory.getProperty(key);
    }
    public static TestProperties getInstance() {
        return propertiesInstance;
    }
}
