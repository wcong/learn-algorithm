package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 24/07/2017
 */
public class MinimumInRotatedSortedArrayIITest {

    @Test
    public void testFindMin() {
        MinimumInRotatedSortedArrayII solution = new MinimumInRotatedSortedArrayII();
        Assert.assertTrue(solution.findMinDivideConquer(new int[]{4, 5, 6, 7, 0, 1, 2}) == 0);

        Assert.assertTrue(solution.findMinDivideConquer(new int[]{4, 4, 4, 4, 4, 4, 4}) == 4);

        Assert.assertTrue(solution.findMinDivideConquer(new int[]{4, 4, 4, 4, 1, 2, 3}) == 1);
        Assert.assertTrue(solution.findMinDivideConquer(new int[]{1, 3, 3}) == 1);
    }

}
