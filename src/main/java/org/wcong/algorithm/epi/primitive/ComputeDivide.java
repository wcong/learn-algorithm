package org.wcong.algorithm.epi.primitive;

/**
 * COMPUTE x/y
 * Given two positive integers, compute their quotient,
 * using only the addition, subtraction, and shifting operators.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 10/03/2018
 */
public class ComputeDivide {

    public int divide(int x, int y) {
        int result = 0;
        while (x >= (y << 1)) {
            int tempResult = 1, temp = y;
            while (x >= (temp << 1)) {
                tempResult <<= 1;
                temp <<= 1;
            }
            result += tempResult;
            x -= temp;
        }
        if (x >= y) {
            result += 1;
        }
        return result;
    }

}
