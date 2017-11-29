package org.wcong.algorithm.ctci.moderate;

import java.util.HashSet;
import java.util.Set;

/**
 * give two array of integers
 * compute the pair of values(one value in each array)
 * with the smallest(non-negative)difference ,return difference
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 29/11/2017
 */
public class SmallestDifferent {

    public int smallestDifferent(int[] array1, int[] array2) {
        int minDifferent = array1[0] - array2[0];
        minDifferent = minDifferent < 0 ? -minDifferent : minDifferent;
        Set<Integer> set2 = new HashSet<>();
        for (int num2 : array2) {
            set2.add(num2);
        }
        for (int num1 : array1) {
            for (int i = 0; i < minDifferent; i++) {
                if (set2.contains(num1 - i)) {
                    minDifferent = i;
                    break;
                }
                if (set2.contains(num1 + i)) {
                    minDifferent = i;
                    break;
                }
            }
            if (minDifferent == 0) {
                break;
            }
        }
        return minDifferent;
    }

}
