package org.wcong.algorithm.ctci.moderate;

/**
 * write a method to find the maximum of two number
 * do not use any compare operate
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 29/11/2017
 */
public class NumberMax {

    public int max(int a, int b) {
        return a | (a ^ b);
    }
}
