package _5_kyu;
// Write a fonction that returns first non-repeated character

import java.util.HashMap;
import java.util.Map;

public class First_non_repeated_MOSH {
    public char findFirstNonRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(var ch : str.toCharArray()){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (var ch : str.toCharArray()){
            if (map.get(ch) == 1){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}
