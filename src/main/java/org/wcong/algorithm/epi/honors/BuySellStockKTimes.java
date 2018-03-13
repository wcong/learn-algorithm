package org.wcong.algorithm.epi.honors;

/**
 * Write a program to compute the maximum profit
 * that can be made by buying and selling a share k times over a given day range.
 * Your program takes k and an array of daily stock prices as input.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 12/03/2018
 */
public class BuySellStockKTimes {

    static class Info {
        int times;
        int profit;
    }

    public int maxProfit(int[] array, int k) {
        Info[] infos = new Info[array.length];
        infos[0] = new Info();
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i]) {

                }
            }
        }
        return 0;
    }

}
