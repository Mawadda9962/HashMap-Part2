import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args){
        Map<String, String> groupString = new HashMap<>();

        String[] word = {"salt", "tea", "soda", "toast"};

        for (String words : word) {

            String key = words.substring(0, 1);

            if (groupString.containsKey(key)) {
                groupString.put(key, groupString.get(key) + words);
            } else {
                groupString.put(key, words);
            }
        }

        System.out.println(groupString);
    }
}