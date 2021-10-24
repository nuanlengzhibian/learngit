package leet_code.queue_stack;


import java.util.Stack;

public class MinStack {
    //利用两个栈，及时的记录对当时而言来说最小的值
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min_stack = new Stack<>();
    int min = Integer.MAX_VALUE;
    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);
        min = Math.min(min,val);
        min_stack.push(min);
    }

    public void pop() {
        stack.pop();
        min_stack.pop();
        min = min_stack.empty()?Integer.MAX_VALUE:min_stack.peek();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
