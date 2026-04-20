import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args){
        Map<String, Integer> FirstAndLastChar = new HashMap<>();

        String[] word = {"salt", "tea", "soda", "toast"};

        for (String words : words) {

            String key = word.substring(0, 1);

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + word);
            } else {
                map.put(key, word);
            }
        }

        System.out.println(map);
    }
}