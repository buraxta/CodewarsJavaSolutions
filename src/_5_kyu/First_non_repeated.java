package _5_kyu;

public class First_non_repeated {
    public static void main(String[] args) {
        System.out.println(first("a green apple"));
    }
        // Write a fonction that returns first non-repeated character

    public static char first(String value){
        for (int i = 0; i<value.length(); i++){
            int asd = 0;
                if(value.charAt(i) == ' ')
                    continue;
            for (int j = i+1; j<value.length(); j++){
                if (value.charAt(i) == value.charAt(j)){
                    asd++;
                    break;
                }
            }
            if (asd == 0)
                return value.charAt(i);
            }
        return '>';
        }
    }


