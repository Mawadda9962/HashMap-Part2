import java.util.HashMap;
import java.util.Map;

public class word0 {
    public static void main(String[] args){
        Map<String, Integer> uniqueWord = new HashMap<>();

        String[] words = {"a", "b", "a", "b"};

        for (String word : words){
            uniqueWord.put(word,0);
        }

        System.out.println(uniqueWord);
    }
}
