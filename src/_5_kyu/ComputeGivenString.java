package _5_kyu;

import java.util.Arrays;

public class ComputeGivenString {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("5+20-15+8**2")));
        String[][] returnedValue = split("5+20-15+8");
        String[] operand = returnedValue[0];
        String[] operators = returnedValue[1];

    }
    public static int Calc(String[] operand, String[] operators){
        int agregate = Integer.parseInt(operand[0]);
        // 2 + 5 - (3 ** 2) * 2 * 3 / 2 * 4 / 2
        for (int i = 1; i<operand.length; i++){
            if (operators[i].equals("+")){
                agregate += Integer.parseInt(operand[i]);
            }else if (operators[i].equals("-")){
                if (operators[i+1].equals("*")){
                    agregate -= (Integer.parseInt(operand[i]) * Integer.parseInt(operand[i+1]));
                } else if (operators[i+1].equals("/")){
                    agregate -= (Integer.parseInt(operand[i]) / Integer.parseInt(operand[i+1]));
                } else if (operators[i+1].equals("**")){
                    agregate -= Integer.parseInt(String.valueOf(Math.pow(Integer.parseInt(operand[i+1]),Integer.parseInt(operand[i+2]))));
                    if (operators[i+2].equals("*")){
                        agregate -= (Integer.parseInt(operand[i+1]) * Integer.parseInt(operand[i+2]));
                    } else if (operators[i+2].equals("/")){
                        agregate -= (Integer.parseInt(operand[i+1]) / Integer.parseInt(operand[i+2]));
                    }
                }
            }
            else if (operators[i].equals("/")){
                agregate /= Integer.parseInt(operand[i]);
            }
            else if (operators[i].equals("*")){
                agregate *= Integer.parseInt(operand[i]);
            }
            else if (operators[i].equals("**")){
                if (operators[i+1].equals("*")){
                    agregate += (Math.pow(Integer.parseInt(operand[i]),Integer.parseInt(operand[i+1])) * Integer.parseInt(operand[i+1]));
                } else if (operators[i+1].equals("/")){
                    agregate += (Math.pow(Integer.parseInt(operand[i]),Integer.parseInt(operand[i+1])) / Integer.parseInt(operand[i+1]));
                }
            }
            else if (operators[i].equals("//")){

            }
        }
        return 0;
    }

    public static String[][] split(String param) {
        char[] newArr = param.toCharArray();
        String[] operand = new String[newArr.length];
        String[] operators = new String[newArr.length];
        String temp = "";
        for (int i = 0, j = 0, k = 0; i < param.length(); i++) {
            // Rakamsa digit'e at
            // 20 + 5
            if (param.charAt(i) >= 48 && param.charAt(i) <= 57) {
                temp += newArr[i];
            }
            // rakam dışı bişi olduğunu anladım
            // son indexe ulaştıysak ve bu +- değilse
            else {
                operand[j++] = temp;
                temp = "";
                operators[k++] = String.valueOf(param.charAt(i));
            }
            if (i == param.length() - 1) {
                operand[j] = temp;
            }
        }
        return new String[][] {operand,operators};
    }
}

