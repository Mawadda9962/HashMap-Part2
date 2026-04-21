
import java.util.HashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args){

        String[] arr = {"ab", "ac"};
        Map<Character, Integer> characterIntegerHashMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            char ch = arr[i].charAt(0);

            if(!characterIntegerHashMap.containsKey(ch)){
                characterIntegerHashMap.put(ch, i);
            }

        }


        }

    }

