package _5_kyu;

// DNA dizilimi alan ve bunu istenilen indexten itibaren istenilen uzunluk aralığına kadar ters çevirerek return eden
// bir method yazın.
// Örnek: "ATG, ACT, GAT, GAG, AGA, TAT, TGA" -> 3 codons from 2th codon -> çıktı: "ATG, GAG, GAT, ACT, AGA, TAT, TGA


import java.util.Arrays;
import java.util.Stack;

public class Reverse_codons {
    public static void main(String[] args) {
        String ex = "ATG ACT GAT GAG AGA TAT TGA";
        String[] result = reverse(ex,2,3);
        System.out.println(Arrays.toString(result));
    }
    public static String[] reverse(String value, int codonNum, int length){
        String[] asList = value.split(" ");
        String[] brandNew = new String[asList.length];
        Stack<String> temp = new Stack<>();
        for (int i = 0; i<asList.length; i++){
            if (i >= codonNum && i <= codonNum+length-1){
                temp.add(asList[i]);
            }else {
                brandNew[i] = asList[i];
            }
        }
        for (int i = codonNum, j = 0; j<temp.size(); i++){
            brandNew[i] = temp.pop();
        }

        return brandNew;
    }
}


