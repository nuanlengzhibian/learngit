package leet_code.queue_stack;

import java.util.Stack;

public class Day20 {

    public static void main(String[] args) {
        System.out.println(Day20.isValid("([])"));
    }
    public static boolean isValid(String s) {
        //直接用单个栈进行实现
//        Stack<Character> left_stack = new Stack<>();
//        int left_number = 0;
//        int right_number = 0;
//        int n = s.length();
//        for (int i = 0;i < n;i++){
//            if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
//                left_number++;
//                left_stack.push(s.charAt(i));
//            }
//            if (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
//                right_number++;
//                if (!left_stack.empty()){
//                    char temp = left_stack.pop();
//                    if (temp == '(')
//                        if (s.charAt(i)==')')
//                            continue;
//                        else
//                            return false;
//                    if (temp == '[')
//                        if (s.charAt(i)==']')
//                            continue;
//                        else
//                            return false;
//                    if (temp == '{')
//                        if (s.charAt(i)=='}')
//                            continue;
//                        else
//                            return false;
//                }
//
//            }
//        }
//        return left_number==right_number && left_stack.empty();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char cStack = stack.pop();
                boolean b1 = c == ')' && cStack != '(';
                boolean b2 = c == ']' && cStack != '[';
                boolean b3 = c == '}' && cStack != '{';
                if (b1 || b2 || b3) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
