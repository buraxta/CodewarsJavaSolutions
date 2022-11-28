package _5_kyu;

// DNA dizilimi alan ve bunu istenilen indexten itibaren istenilen uzunluk aralığına kadar ters çevirerek return eden
// bir method yazın.
// Örnek: "ATG, ACT, GAT, GAG, AGA, TAT, TGA" -> 3 codons from 2th codon -> çıktı: "ATG, GAG, GAT, ACT, AGA, TAT, TGA

import java.util.Arrays;
import java.util.Stack;

public class Reverse_codons {
    public static void main(String[] args) {
        String ex = "ATG ACT GAT GAG AGA TAT TGA";
        String[] result = reverse(ex,3,4);
        System.out.println(Arrays.toString(result));
    }
    public static String[] reverse(String value, int codonNum, int length){
        codonNum--;
        String[] asList = value.split(" ");
        String[] brandNew = new String[asList.length];
        String[] temp = new String[length];
        for (int i = 0, k = 0; i<asList.length; i++){
            if (i >= codonNum && i <= codonNum+length-1){
                temp[k++] = asList[i];
            }else {
                brandNew[i] = asList[i];
            }
        }
        temp = reverseArray(temp);
        for (int i = codonNum, j = 0; i<codonNum+length; i++){
            brandNew[i] = temp[j++];
        }
        return brandNew;
    }

    public static String[] reverseArray(String[] param){
        String[] newArray = new String[param.length];
        for (int i = param.length-1, j = 0; i>=0; i--, j++){
            newArray[j] = param[i];
        }
        return newArray;
    }
}


