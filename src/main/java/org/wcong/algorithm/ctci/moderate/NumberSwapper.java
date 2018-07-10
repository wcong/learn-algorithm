package org.wcong.algorithm.ctci.moderate;

/**
 * write a function to swap a number in place
 * without temporary variables
 * give two number a,b
 * swap a,b value
 * about bit manipulation ^ ~ & |
 * 1 0
 * <p>
 * <p>
 * 1^1 = 0 0  0^0 =0 ~ 1
 * 1^0 = 1 1  1^1 =0 ~ 1
 * 0^0 = 0 1  1^0 =1 ~ 0
 * 0^1 = 1 0  0^1 =1 ~ 0
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 28/11/2017
 */
public class NumberSwapper {


    /**
     * how do you thing a number
     * 1. in bit represent
     * 2. in number line represent
     *
     * @param a
     * @param b
     */

    public void swapNumber(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
