import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args){
        Map<String, Integer> FirstAndLastChar = new HashMap<>();

        String[] words = {"a", "b", "a", "c", "b"};

        for(String word : words){

            if(FirstAndLastChar.containsKey(word)){
                FirstAndLastChar.put(word, FirstAndLastChar.get(word) + 1);
            }else{
                FirstAndLastChar.put(word,1);
            }
        }
        System.out.println();
    }
}
