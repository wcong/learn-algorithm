package org.wcong.algorithm.epi.primitive;

/**
 * Write a program that multiplies two non-negative integers.
 * The only operators you are allowed to use are
 * • assignment,
 * • the bitwise operators»,«,|,&, “ and
 * • equality checks and Boolean combinations thereof
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 10/03/2018
 */
public class Multiplication {

    public int multiplication(int x, int y) {
        int result = 0;
        int base = 0;
        while (y > 0) {
            if ((y & 1) == 1) {
                result = addition(result, x << base);
            }
            base += 1;
            y >>= 1;
        }
        return result;
    }

    private int addition(int x, int y) {
        while (y > 0) {
            int minOne = y & (~(y & (y - 1)));
            while ((x & minOne) > 0) {
                x &= ~(minOne);
                minOne <<= 1;
            }
            x |= minOne;
            y &= (y - 1);
        }
        return x;
    }
}
