import java.util.HashMap;
import java.util.Map;

public class practice {
}


String[] arr = {"ab", "ac"};

Map<Character, Integer> characterIntegerHashMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

char ch = arr[i].charAt(0);

            if(!characterIntegerHashMap.containsKey(ch)){
        characterIntegerHashMap.put(ch, i);
            }
                    else {
int prevIndex = characterIntegerHashMap.get(ch);

// swap
String temp = arr[i];
arr[i] = arr[prevIndex];
arr[prevIndex] = temp;

                characterIntegerHashMap.remove(ch);
            }
                    }

                    for(String s : arr){
        System.out.print(s + " ");
        }
                }
                }