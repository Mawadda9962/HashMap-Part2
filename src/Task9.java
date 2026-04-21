import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args){
        String[] arr = {"ab", "ac"};
        Map<Character, Integer> onlyOneSwap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            char ch = arr[i].charAt(0);

            // إذا أول مرة نشوف الحرف
            if(!onlyOneSwap.containsKey(ch)){
                onlyOneSwap.put(ch, i);
            }

            // إذا موجود ولم يتم تعطيله
            else if(onlyOneSwap.get(ch) != -1){

                int prevIndex = onlyOneSwap.get(ch);