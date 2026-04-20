import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args){
        Map<String, String> FirstAndLastChar = new HashMap<>();

        String[] words = {"code", "bug"};

        for (String word: words){
            String key = word.charAt(0);
            String value = word.charAt(word.length()-1);

            FirstAndLastChar.put(key,value);


        }
        System.out.println(FirstAndLastChar);
    }
}
