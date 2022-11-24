package _5_kyu;

import java.util.Stack;

public class Valid_Parentheses {
    public static boolean validParentheses(String parens)
    {
        Stack<Character> parents = new Stack<>();

        for(int i = 0; i<parens.length(); i++){
            if (parens.charAt(i) == '('){
                parents.push('(');
            }
            if (parens.charAt(i) == ')'){
                if (parents.isEmpty()){
                    return false;
                }
                parents.pop();
            }
        }
        return parents.contains('(') ? false : true;
    }
}
