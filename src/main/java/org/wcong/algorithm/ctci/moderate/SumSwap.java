package org.wcong.algorithm.ctci.moderate;

import java.util.HashSet;
import java.util.Set;

/**
 * give two array of integer
 * find a pair of values that you can swap to give two arrays the same sum
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 30/11/2017
 */
public class SumSwap {

    // 4, 1, 2, 1, 1, 2
    // 3,6,3,3,
    public int[] sumSwap(int[] array1, int[] array2) {
        int sum1 = array1[0];
        for (int i = 1; i < array1.length; i++) {
            sum1 += array1[i];
        }
        Set<Integer> array2Set = new HashSet<>();
        int sum2 = array2[0];
        for (int i = 1; i < array2.length; i++) {
            sum2 += array2[i];
            array2Set.add(array2[i]);
        }
        for (int i = 0; i < array1.length; i++) {
            int left1 = sum1 - array1[i];
            int needNum = sum2 + array1[i] - left1;
            if ((needNum & 1) == 1) {
                continue;
            }
            needNum = needNum >> 1;
            if (array2Set.contains(needNum)) {
                return new int[]{array1[i], needNum};
            }
        }
        return new int[2];
    }

}
