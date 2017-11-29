package org.wcong.algorithm.ctci.moderate;

/**
 * calculate the trail zeros of n factorial
 * tips
 * numbers of 2*5 but 2 is far less than 5
 * so just calculate numbers of 5
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 29/11/2017
 */
public class FactorialZeros {

    public int trailZeros(int n) {
        int nums = 0;
        while (n > 0) {
            n = n / 5;
            nums += n;
        }
        return nums;
    }

}
