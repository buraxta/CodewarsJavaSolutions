package _7_kyu;

public class IsItaTriangle {
    public static boolean isTriangle(int a, int b, int c){
        boolean result = true;
        if(a != 0 && b != 0 && c != 0){
            if(Math.abs(b-c)<a && a<b+c){
                result = true;
            }
            else if(Math.abs(a-c)<b && b<a+c){
                result = true;
            }
            else if(Math.abs(a-b)<c && c<a+b){
                result = true;
            }
            else{
                result = false;
            }
        }
        else{
            result = false;
        }
        return result;
    }
}
