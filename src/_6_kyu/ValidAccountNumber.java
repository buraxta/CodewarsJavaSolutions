package _6_kyu;

import java.util.Scanner;

/*
Question-3: Examine a valid account number (40 pts)
Write a program that prompts the user to enter an account number. Display whether the number is
valid or invalid according to the following situations.
Account numbers follow certain patterns.
1) An account number must have 16 characters. It must start with two capital letters but the
first letter must always be lower than the second. (for example: AB, CH, AZ, etc.)
2) Two digits after the letters must be prime numbers.
3) For the next 12 digits:
a) Double every second digit from right to left. If doubling of a digit results in a two-digit
number, add up the two digits to get a single-digit number.
b) Now add all single-digit numbers from Step a.
4 + 4 + 8 + 2 + 3 + 1 = 22
c) Add all digits in the odd places from right to left in the card number.
 6 + 6 + 0 + 8 + 0 + 7 = 27
d) Sum the results from Step b and Step c.
22 + 27 = 49
e) If the result from Step d is divisible by 10, the account number is valid; otherwise, it is
invalid.
For example:
The account number AC11576018412626 is a valid.
* */
public class ValidAccountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean isValid = true;

        //check the length
        if(answer.length() != 16){
            isValid = false;
        }
        //check first two char
        char firstLetter = answer.charAt(0);
        char secondLetter = answer.charAt(1);
        if (firstLetter < 65 || secondLetter < 65 || firstLetter > 90 || secondLetter > 90){
            isValid = false;
        }
        if (firstLetter > secondLetter){
            isValid = false;
        }

        //check next two int to be prime or not
        int nextTwoInt = Integer.parseInt(answer.substring(2,4));
        if (!isPrime(nextTwoInt)){
            isValid = false;
        }

        //check other digits if suitable for our laws or not
        int doubleDigits = doubleEverySecondDigit(answer.substring(4));
        int singleDigits = singleDigitNumbers(answer.substring(4));
        isValid = (doubleDigits+singleDigits)%10 == 0 ? true : false;

        //Print the result
        String result = "This account number is ";
        result += isValid ? "VALID!" : "INVALID";
        System.out.println(result);
    }

    public static boolean isPrime(int value){
        for (int i = 2; i<value; i++){
            if (value % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int doubleEverySecondDigit(String arg){
        int sum = 0;
        for (int i = 0; i < 11; i+=2){
            int value = Character.getNumericValue(arg.charAt(i)) * 2;
            if (value > 9){
                int temp = value;
                value = 0;
                value += temp % 10;
                temp /= 10;
                value += temp;
            }
            sum +=  value;

        }
        return sum;
    }

    public static int singleDigitNumbers(String arg){
        int sum = 0;
        for (int i = 1; i < 12; i+=2){
            sum += Character.getNumericValue(arg.charAt(i));
        }
        return sum;
    }

}

































