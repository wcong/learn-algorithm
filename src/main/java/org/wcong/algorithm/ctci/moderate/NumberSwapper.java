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

    public static class Numbers {
        public int a;
        public int b;

        public Numbers(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public void swapNumber(Numbers numbers) {
        numbers.a = numbers.a ^ numbers.b;
        numbers.b = numbers.a ^ numbers.b;
        numbers.a = numbers.a ^ numbers.b;
    }
}
