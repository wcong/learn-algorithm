package org.wcong.algorithm.jzoffer.stack;

import java.util.Stack;

/**
 * test for stack and queue
 * implement a queue bu two stack
 * Created by wcong on 2017/3/24.
 */
public class TwoStackForQueue {


    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);
        stackQueue.push(4);
        assert (stackQueue.pop() == 1);
        assert (stackQueue.pop() == 2);
        assert (stackQueue.pop() == 3);
        assert (stackQueue.pop() == 4);
    }


    public static class StackQueue {

        private Stack<Integer> in = new Stack<>();

        private Stack<Integer> out = new Stack<>();

        public void push(int num) {
            in.push(num);
        }

        public int pop() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
            return out.pop();
        }
    }

}
