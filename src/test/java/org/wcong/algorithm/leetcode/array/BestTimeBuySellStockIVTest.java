package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 06/09/2017
 */
public class BestTimeBuySellStockIVTest {

    @Test
    public void testMaxProfit() {
        BestTimeBuySellStockIV solution = new BestTimeBuySellStockIV();
        Assert.assertTrue(solution.maxProfit(1, new int[]{1, 2, 3, 4, 5, 6}) == 5);
        Assert.assertTrue(solution.maxProfit(2, new int[]{1, 2, 3, 4, 5, 6}) == 5);
    }

}
