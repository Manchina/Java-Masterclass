import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("C","first");
        languages.put("python","second");
        languages.put("java", "third");
        languages.put("c++","fourth");

        languages.remove("c++");

        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
