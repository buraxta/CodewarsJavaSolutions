package _7_kyu;

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class VowelCount {
    public static int getCount(String str) {
        int result = 0;
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.addAll(Arrays.asList('a','e','i','o','u'));
        for (int i = 0; i<str.length(); i++){
            if (vowels.contains(str.charAt(i))){
                result++;
            }
        }
        return result;
    }
}
