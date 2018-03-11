package org.wcong.algorithm.epi.array.onedimension;

import java.util.Stack;

/**
 * Write a program which takes an array of n integers,
 * where A[i] denotes the maximum you can advance from index i,
 * and returns whether it is possible to
 * advance to the last index starting from the beginning of the array.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 11/03/2018
 */
public class AdvanceThroughArray {

    public boolean through(int[] array) {
        Stack<Integer> stack = new Stack<>();
        if (array[0] <= 0) {
            return false;
        }
        for (int i = 1; i <= array[0]; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            if (index + array[index] >= array.length - 1) {
                return true;
            }
            for (int i = 1; i <= array[index]; i++) {
                stack.push(index + i);
            }
        }
        return false;
    }

}
