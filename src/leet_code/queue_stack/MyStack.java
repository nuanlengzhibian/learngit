package leet_code.queue_stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue1 = new ArrayDeque<>();
    public MyStack() {

    }

    public void push(int x) {
        queue1.add(x);
        int n = queue1.size();
        while(n > 1){
            queue1.add(queue1.poll());
            n--;
        }
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
