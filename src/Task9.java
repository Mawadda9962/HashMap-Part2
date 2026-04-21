import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args){
        String[] arr = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]};
        Map<Character, Integer> onlyOneSwap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            char ch = arr[i].charAt(0);

            if(!onlyOneSwap.containsKey(ch)){
                onlyOneSwap.put(ch, i);
            }

            else if(onlyOneSwap.get(ch) != -1){

                int prevIndex = onlyOneSwap.get(ch);

                String temp = arr[i];
                arr[i] = arr[prevIndex];
                arr[prevIndex] = temp;

                onlyOneSwap.put(ch, -1);
            }

        }
        for(String s : arr){
            System.out.print(s + " ");
        }
    }
}

