package utils;

import org.aeonbits.owner.Config;

@Config.Sources({"file:.src/main/resources/environment.properties"})
public interface ConfigProperties extends Config {
    @Key("homepage")
    String homepageUrl();
}
