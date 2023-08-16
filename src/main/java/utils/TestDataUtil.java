package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class TestDataUtil {
    private static final Properties properties = new Properties();
    private static final FileReader reader;

    static {
        try {
            reader = new FileReader("/Users/anovosiolov/Desktop/UI-testing-task/src/main/resources/testdata.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static HashMap<String, String> loadedData(){
        try {
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.entrySet().stream().collect(
                Collectors.toMap(
                        key -> String.valueOf(key.getKey()),
                        value -> String.valueOf(value.getValue()),
                        (prev, next) -> next, HashMap::new
                ));

    }
    public static void setData(String key,String value){
        properties.setProperty(key,value);
    }
}
