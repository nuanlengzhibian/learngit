package leet_code.queue_stack;

import java.util.Stack;

public class Day227 {
    public static void main(String[] args) {
        System.out.println(Day227.calculate("14/3*2"));
    }
    public static int calculate(String s) {
        Stack<Integer> number = new Stack<>();
        Stack<Character> ops = new Stack<>();
        int res = 0;

        int n = s.length();
        int i = 0;
        while(i < n){
            if (s.charAt(i) == ' ')
                i++;
            else if (s.charAt(i) == '+'){
                ops.push('+');
                i++;
            }else if (s.charAt(i) == '-'){
                ops.push('-');
                i++;
            }else if (s.charAt(i) == '*'){
                ops.push('*');
                i++;
            }else if (s.charAt(i) == '/'){
                ops.push('/');
                i++;
            }else {
                long num = 0;
                while(i < n && Character.isDigit(s.charAt(i))){
                    num = num*10 + s.charAt(i)-'0';
                    i++;
                }
                number.push((int)num);
            }
        }
        while(!ops.empty()){
            if (ops.peek() == '/') {
                int a = number.pop();
                int b = number.pop();
                int temp = b / a;
                ops.pop();
                number.push(temp);
            } else if (ops.peek() == '*') {
                ops.pop();
                number.push(number.pop() * number.pop());
            } else if (ops.peek() == '+') {
                ops.pop();
                res = res + number.pop();
            } else if (ops.peek() == '-') {
                ops.pop();
                res = res - number.pop();
            }
        }
        return number.empty()? res:(res+number.pop());

    }
}
