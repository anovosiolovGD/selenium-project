package utils;

import org.aeonbits.owner.ConfigFactory;

public class TestProperties {
    private final ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);

    public String getHomepageUrl() {
        return homepageUrl;
    }

    private final String homepageUrl = configProperties.homepageUrl();

    public String getProperty(String key) {
        return ConfigFactory.getProperty(key);
    }

    public static TestProperties getInstance() {
        return new TestProperties();
    }
}
