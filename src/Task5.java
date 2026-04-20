import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args){
        Map<String, String> FirstAndLastChar = new HashMap<>();

        String[] word = {"salt", "tea", "soda", "toast"};

        for (String words : word) {

            String key = word.substring(0, 1);

            if (FirstAndLastChar.containsKey(key)) {
                FirstAndLastChar.put(key, FirstAndLastChar.get(key) + word);
            } else {
                FirstAndLastChar.put(key, word);
            }
        }

        System.out.println(FirstAndLastChar);
    }
}