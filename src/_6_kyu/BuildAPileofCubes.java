package _6_kyu;
/*
Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n3 n^3n3,
the cube above will have volume of (n−1)3 (n-1)^3(n−1)3 and so on until the top which will have a volume of 13 1^313.
You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?
The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m and you have to
return the integer n such as n3+(n−1)3+(n−2)3+...+13=m n^3 + (n-1)^3 + (n-2)^3 + ... + 1^3 = mn3+(n−1)3+(n−2)3+...+13=m if such a n exists or -1
if there is no such n.
Examples:
findNb(1071225) --> 45
findNb(91716553919377) --> -1


* */
public class BuildAPileofCubes {
    public static void main(String[] args) {
        System.out.println(findNb(91716553919377l));
    }
    public static long findNb(long m){
        long total = 0;
        long flag = 1;
        while (total != m){
            if (total<m){
                total += (long) Math.pow(flag++,3);
            } else if (total>m) {
                return -1;
            }
        }
        return flag-1;
    }
}

