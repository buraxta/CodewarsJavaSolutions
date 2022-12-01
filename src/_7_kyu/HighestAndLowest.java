package _7_kyu;
/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5");  // return "5 1"
highAndLow("1 2 -3 4 5"); // return "5 -3"
highAndLow("1 9 3 4 -5"); // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.

*/
public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(finder("1 2 3 4 -2"));
    }
    public static String finder(String given){
        var asStCh = given.split(" ");
        int highest = Integer.MIN_VALUE;
        int lower = Integer.MAX_VALUE;
        for (int i = 0; i<asStCh.length; i++){
            int asInt = Integer.parseInt(String.valueOf(asStCh[i]));
            highest = Math.max(highest, asInt);
            lower = Math.min(lower, asInt);
        }
        return highest + " " + lower;
    }
}
