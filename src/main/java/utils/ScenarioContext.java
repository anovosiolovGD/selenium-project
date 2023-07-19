package utils;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    private static final Map<String, Object> scenarioContext;

    static {
        scenarioContext = new HashMap<>();
    }

    private ScenarioContext() {
    }

    public ScenarioContext getInstance() {
        return this;
    }

}
