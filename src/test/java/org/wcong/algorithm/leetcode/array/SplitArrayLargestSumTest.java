package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 27/07/2017
 */
public class SplitArrayLargestSumTest {

    @Test
    public void testSplitArray() {
        SplitArrayLargestSum solution = new SplitArrayLargestSum();
//        Assert.assertTrue(solution.splitArrayDp(new int[]{7, 2, 5, 10, 8}, 2) == 18);
        Assert.assertTrue(solution.splitArrayDp(new int[]{10,5,13,4,8,4,5,11,14,9,16,10,20,8}, 8) == 25);
    }

}
