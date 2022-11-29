package _5_kyu;

import java.util.Arrays;
import java.util.LinkedList;

public class StringCoomputer {
    public static void main(String[] args) {
        // 5+20-15+8**2
//        LinkedList<Character> items = new LinkedList<>();
//        items.add('5');
//        items.add('+');
//        items.add('2');
//        items.add('0');
//        items.add('-');
//        items.add('1');
//        items.add('5');
//        items.add('+');
//        items.add('8');
//        items.add('*');
//        items.add('*');
//        items.add('2');
//        System.out.println(items);
//        for (int i = 0; i<items.size(); i++){
//            // 152
//                if (items.get(i) == '*'){
//                    if (items.get(i+1) == '*'){
//                        int temp = Integer.parseInt(Math.pow(items.get(i-1),items.get(i+2));
//                    }
//            }
//        }
        String[][] returnedValue = split("5+20-15+8**2");
        String[] operand = returnedValue[0];
        String[] operators = returnedValue[1];
        System.out.println("Operand " + Arrays.toString(operand));
        System.out.println("Operators " + Arrays.toString(operators));
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
                String tempOperator = "";
                if (param.charAt(i) == '*'){
                    tempOperator += "*";
                    if (param.charAt(++i) == '*'){
                        tempOperator += "*";
                        operators[k++] = tempOperator;
                    }else{
                        operators[k++] = tempOperator;
                    }
                        }
                else {
                    operators[k++] = String.valueOf(param.charAt(i));
                }

            }
            if (i == param.length() - 1) {
                operand[j] = temp;
            }
        }
        return new String[][] {operand,operators};
    }


}
