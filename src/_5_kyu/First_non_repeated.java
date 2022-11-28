package _5_kyu;

import java.util.HashMap;
import java.util.Map;

// Write a fonction that returns first non-repeated character
public class First_non_repeated {
    public static void main(String[] args) {
        System.out.println(first("a green apple"));
        Map<Integer,String> arr = new HashMap<>();
        arr.put(2,"Buuu");
    }
    public static char first(String value){
        for (int i = 0; i<value.length(); i++){
            int flag = 0;
                if(value.charAt(i) == ' ')
                    continue;
            for (int j = i+1; j<value.length(); j++){
                if (value.charAt(i) == value.charAt(j)){
                    flag++;
                    break;
                }
            }
            if (flag == 0)
                return value.charAt(i);
            }
        return '>';
        }
    }


