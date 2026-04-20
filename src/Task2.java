import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args){
        Map<String, Integer> uniqueWordAndLengthAsValue = new HashMap<>();

        String[] word = {"a", "bb", "a", "bb"};

        for(String words : word){
            uniqueWordAndLengthAsValue.put(word , word.length());
        }



    }
}
