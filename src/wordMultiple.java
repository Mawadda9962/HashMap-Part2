import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public static void main(String[] args){

        Map<String, Boolean> wordAppears2OrMore = new HashMap<>();

        String[] word = {"a", "b", "a", "c", "b"};

        for(String words : word){

            if(wordAppears2OrMore.containsKey(words)){
                wordAppears2OrMore.put(words, true);
            } else {
                wordAppears2OrMore.put(words, false);
            }
        }

        System.out.println(wordAppears2OrMore);
    }
}



