package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 23/07/2017
 */
public class BestTimeBuySellStockIIITest {

    @Test
    public void testMaxProfit() {
        BestTimeBuySellStockIII solution = new BestTimeBuySellStockIII();
//        Assert.assertTrue(solution.maxProfitDp(new int[]{3, 2, 3}) == 1);
//        Assert.assertTrue(solution.maxProfitDp(new int[]{3, 2, 1}) == 0);
//        Assert.assertTrue(solution.maxProfitDp(new int[]{1, 2, 3, 4, 5, 6}) == 5);
//        Assert.assertTrue(solution.maxProfitDp(new int[]{1, 3, 10, 5, 9}) == 13);
//        Assert.assertTrue(solution.maxProfitDp(new int[]{2, 1, 2, 1, 0, 1, 2}) == 3);
        Assert.assertTrue(solution.maxProfitDp(new int[]{3, 3, 5, 0, 0, 3, 1, 4}) == 6);

    }

}
