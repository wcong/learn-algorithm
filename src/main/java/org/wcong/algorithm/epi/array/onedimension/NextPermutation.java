package org.wcong.algorithm.epi.array.onedimension;

import java.util.Arrays;

/**
 * Write a program that takes as input a permutation,
 * and returns the next permutation under dictionary ordering.
 * If the permutation is the last permutation, return the empty array.
 * For example, if the input is (1,0,3,2) your function should return (1, 2, 0, 3).
 * If the input is (3, 2,1, 0), return ().
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 27/02/2018
 */
public class NextPermutation {

    public void nextPermutation(int[] array) {
        int reverseIndex = array.length - 2;
        for (; reverseIndex >= 0; reverseIndex--) {
            if (array[reverseIndex] < array[reverseIndex + 1]) {
                break;
            }
        }
        int index = -1;
        for (int i = array.length - 1; i > reverseIndex; i--) {
            if (array[i] < array[reverseIndex]) {
                continue;
            }
            if (index == -1) {
                index = i;
            } else if (array[i] < array[index]) {
                index = i;
            }
        }
        int temp = array[reverseIndex];
        array[reverseIndex] = array[index];
        array[index] = temp;
        Arrays.sort(array, reverseIndex + 1, array.length);
    }

}
