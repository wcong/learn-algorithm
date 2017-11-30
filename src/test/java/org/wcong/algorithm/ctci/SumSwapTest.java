package org.wcong.algorithm.ctci;

import org.junit.Test;
import org.wcong.algorithm.ctci.moderate.SumSwap;

import java.util.Arrays;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 30/11/2017
 */
public class SumSwapTest {

    @Test
    public void testSumSwap() {
        SumSwap sumSwap = new SumSwap();
        int[] array1 = new int[]{4, 1, 2, 1, 1, 2};
        int[] array2 = new int[]{3, 6, 3, 3};
        assert Arrays.equals(sumSwap.sumSwap(array1, array2), new int[]{1, 3});
    }

}
