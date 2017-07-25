package org.wcong.algorithm.leetcode.array;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 * Note:
 * You may not engage in multiple transactions at the same time
 * (ie, you must sell the stock before you buy again).
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 19/07/2017
 */
public class BestTimeBuySellStockIII {

    public int maxProfitDp(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int[] minIndex = new int[prices.length];
        int[] profitArray = new int[prices.length];
        minIndex[0] = 0;
        profitArray[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= prices[minIndex[i - 1]]) {
                minIndex[i] = i;
                profitArray[i] = profitArray[i - 1];
            } else {
                minIndex[i] = minIndex[i - 1];
                int maxProfit = profitArray[i - 1];
                for (int j = i - 1; j > -1; j--) {
                    if (prices[j] < prices[i]) {
                        int profit = prices[i] - prices[j];
                        if (j > 0) {
                            profit += profitArray[j - 1];
                        }
                        if (profit > maxProfit) {
                            maxProfit = profit;
                        }
                    } else {
                        if (prices[i] <= prices[minIndex[j]]) {
                            break;
                        }
                    }
                }
                profitArray[i] = maxProfit;
            }
        }
        return profitArray[prices.length - 1];
    }
}
