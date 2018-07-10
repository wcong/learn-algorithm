package org.wcong.algorithm.ctci.stackqueue;

import java.util.Stack;

/**
 *
 * 5,2,4,2,5,3
 * 5,2,2
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/6/6
 */
public class StackMin {

    Stack<Integer> originStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(Integer value) {
        originStack.push(value);
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            Integer currentMinValue = minStack.peek();
            if (currentMinValue >= value) {
                minStack.push(value);
            }
        }
    }

    public Integer pop() {
        Integer value = originStack.pop();
        if (value <= minStack.peek()) {
            minStack.pop();
        }
        return value;
    }

    public Integer min() {
        return minStack.peek();
    }

}
