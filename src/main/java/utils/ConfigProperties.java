package utils;

import org.aeonbits.owner.Config;

@Config.Sources({"file:./src/main/resources/testdata.properties"})
public interface ConfigProperties extends Config {
    String homepageUrl();
}
