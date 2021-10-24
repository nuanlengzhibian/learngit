package leet_code.queue_stack;

import java.util.Stack;

public class MyQueue {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    public MyQueue() {

    }

    public static void push(int x) {
        stack1.push(x);
    }

    public static int pop() {
        //当第二个栈为空的时候第一个栈才转移元素，不然容易造成顺序混乱
        if (stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public static int peek() {
        if (stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public static boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}
