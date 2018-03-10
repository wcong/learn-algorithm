package org.wcong.algorithm.epi.primitive;

import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 10/03/2018
 */
public class MultiplicationTest {

    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication();
        assert multiplication.multiplication(4, 5) == 20;
    }

}
