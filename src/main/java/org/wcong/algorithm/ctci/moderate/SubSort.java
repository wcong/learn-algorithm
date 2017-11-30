package org.wcong.algorithm.ctci.moderate;

import java.util.Stack;

/**
 * given a array of integer
 * write a method to find indices m and n
 * such if you sorted elements m through n the entire array will be sorted
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 30/11/2017
 */
public class SubSort {

    // tips
    // brute force O(n*n*n) iterate all possible indices
    // use memory like stack
    public int[] subSort(int[] array) {
        Stack<Integer> startStack = new Stack<>();
        startStack.push(0);
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[startStack.peek()]) {
                startStack.push(i);
            } else {
                break;
            }
        }
        Stack<Integer> endStack = new Stack<>();
        endStack.push(array.length - 1);
        for (int i = array.length - 2; i > startStack.peek(); i--) {
            if (array[i] <= array[endStack.peek()]) {
                endStack.push(i);
            } else {
                break;
            }
        }
        if (startStack.size() + endStack.size() == array.length) {
            return new int[]{0, array.length};
        }
        int min = array[startStack.peek() + 1], max = array[startStack.peek() + 1];
        for (int i = startStack.peek() + 2; i < endStack.peek() - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        while (!startStack.isEmpty()) {
            if (array[startStack.peek()] > min) {
                startStack.pop();
            } else {
                break;
            }
        }
        while (!endStack.isEmpty()) {
            if (array[endStack.peek()] < max) {
                endStack.pop();
            } else {
                break;
            }
        }
        return new int[]{startStack.isEmpty() ? 0 : startStack.peek(), endStack.isEmpty() ? array.length - 1 : endStack.pop()};
    }

}
