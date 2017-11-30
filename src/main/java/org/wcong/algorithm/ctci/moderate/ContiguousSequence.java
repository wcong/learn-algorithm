package org.wcong.algorithm.ctci.moderate;

/**
 * given an array of integer  positive and negative
 * find the largest contiguous sequence
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 30/11/2017
 */
public class ContiguousSequence {

    // tips sequence
    public int[] largestSequence(int[] array) {
        int max = array[0];
        int[] maxIndex = new int[]{0, 0};
        int current = array[0];
        int currentStartIndex = 0;
        for (int i = 1; i < array.length; i++) {
            current += array[i];
            if (current > max) {
                max = current;
                maxIndex[0] = currentStartIndex;
                maxIndex[1] = i;
            } else if (current <= 0) {
                current = array[i];
                currentStartIndex = i;
            }
        }
        return maxIndex;
    }

}
