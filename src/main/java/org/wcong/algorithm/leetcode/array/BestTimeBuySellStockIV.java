package org.wcong.algorithm.leetcode.array;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit.
 * You may complete at most k transactions.
 * Note:
 * You may not engage in multiple transactions at the same time
 * (ie, you must sell the stock before you buy again).
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 05/09/2017
 */
public class BestTimeBuySellStockIV {
    public int maxProfit(int k, int[] prices) {
        return maxProfit(prices, 0, k, 0, -1);
    }

    private int maxProfit(int[] prices, int index, int left, int current, int boughtPrice) {
        if ((boughtPrice < 0 && left <= 0) || index >= prices.length) {
            return current;
        }
        int maxProfit = current;
        if (boughtPrice >= 0) {
            while (index < prices.length) {
                if (prices[index] > boughtPrice) {
                    int profit = maxProfit(prices, index + 1, left, current + prices[index] - boughtPrice, -1);
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
                index += 1;
            }
        } else {
            while (index < prices.length) {
                int profit = maxProfit(prices, index + 1, left - 1, current, prices[index]);
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
                index += 1;
            }
        }
        return maxProfit;
    }
}
