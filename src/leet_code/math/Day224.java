package leet_code.math;

import java.util.Deque;
import java.util.LinkedList;

public class Day224 {
    public static void main(String[] args) {
        System.out.println(Day224.calculate("- (3 + (4 + 5))"));
    }
    public static int calculate(String s) {
        //双端队列，既拥有队列的性质，也拥有栈的性质。
        Deque<Integer> ops = new LinkedList<>();
        ops.push(1);
        //标志位，用于区分正负
        int sign = 1;

        //保存最后的结果
        int ret = 0;
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if (s.charAt(i) == '+') {
                sign = ops.peek();
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -ops.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                ops.push(sign);
                i++;
            } else if (s.charAt(i) == ')') {
                ops.pop();
                i++;
            } else {
                long num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                ret += sign * num;
            }
        }
        return ret;
    }
}
