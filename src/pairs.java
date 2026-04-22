import java.util.HashMap;
import java.util.Map;

public class pairs {
    public static void main(String[] args){
        Map<String, String> FirstAndLastChar = new HashMap<>();

        String[] words = {"code", "bug"};

        for (String word: words){
            String key = word.substring(0,1);
            String value = word.substring(word.length()-1);

            FirstAndLastChar.put(key,value);


        }
        System.out.println(FirstAndLastChar);
    }
}
