package _6_kyu;
/*
Give the summation of all even numbers in a Fibonacci sequence up to, but not including, the number passed to your function. Or, in other words, sum all the even Fibonacci numbers that are lower than the given number n (n is not the nth element of Fibonnacci sequence) without including n.

The Fibonacci sequence is a series of numbers where the next value is the addition of the previous two values. The series starts with 0 and 1:

0 1 1 2 3 5 8 13 21...

For example:

fibonacci(0)==0
fibonacci(33)==10
fibonacci(25997544)==19544084
*/


public class EvenFibonacciSum {
    public static void main(String[] args) {
        System.out.println( aFunc(2147483647));
    }
    public static long aFunc(int max){
        long sum = 0;
        long first = 0;
        long sec = 1 ;
        for (; sec+first<max; ){
            long temp = sec;
            sec = first + sec;
            first = temp;
            sum += (sec%2==0) ? sec : 0;
            System.out.println(sec);
        }
        return sum;
    }

}

