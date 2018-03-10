package org.wcong.algorithm.epi.primitive;

import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 10/03/2018
 */
public class ComputeDivideTest {

    @Test
    public void testComputeDivide() {
        ComputeDivide computeDivide = new ComputeDivide();
        assert computeDivide.divide(0b111111, 0b11) == 21;
    }

}
