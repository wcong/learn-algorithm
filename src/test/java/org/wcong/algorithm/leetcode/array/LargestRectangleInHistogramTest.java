package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 10/07/2017
 */
public class LargestRectangleInHistogramTest {

    @Test
    public void testLargestRectangleArea() {
        LargestRectangleInHistogram solution = new LargestRectangleInHistogram();
        Assert.assertTrue(solution.largestRectangleGreed(new int[]{2, 1, 5, 6, 2, 3}) == 10);
    }

}
