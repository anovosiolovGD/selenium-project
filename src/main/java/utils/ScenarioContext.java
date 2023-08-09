package utils;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private static ScenarioContext instance;
    private static final Map<String, Object> contextMap;

    static {
        contextMap = new HashMap<>();
    }

    private ScenarioContext() {
    }

    public static ScenarioContext getInstance() {
        if (instance == null) {
            instance = new ScenarioContext();
        }
        return instance;
    }
    public <T> T get(String key, Class<T> clas) {
        return clas.cast(contextMap.get(key));
    }

    public void put(String key, Object value) {
        contextMap.put(key, value);
    }

    public void remove(String key) {
        contextMap.remove(key);
    }

    public void removeAll() {
        contextMap.clear();
    }

}
