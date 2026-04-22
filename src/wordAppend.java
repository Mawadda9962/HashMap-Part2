import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    public static void main(String[] args){

        Map<String, Integer> AppendWord = new HashMap<>();

        String[] word = {"a", "b", "a", "c", "a", "d", "a"};

        String result = "";
        for(String words : word){

            if(AppendWord.containsKey(words)){
                AppendWord.put(words, AppendWord.get(words) + 1);
            } else {
                AppendWord.put(words, 1);
            }

            int count = AppendWord.get(words);

            if(count % 2 == 0){
                result = result + words;
            }
        }

        System.out.println(result);
    }
}