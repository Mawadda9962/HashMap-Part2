import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args){

        Map<String, Integer> wordAppears2OrMore = new HashMap<>();

        String[] word = {"a", "b", "a", "c", "b"};

        for(String words : word){
            if(wordAppears2OrMore.containsKey(words)){
                wordAppears2OrMore.put(words, wordAppears2OrMore.get(words) + 1);

        }
    }
}
