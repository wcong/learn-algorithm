package org.wcong.algorithm.epi.primitive;

import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 10/03/2018
 */
public class SwapBitsTest {

    @Test
    public void testSwapBits() {
        SwapBits swapBits = new SwapBits();
        assert swapBits.swapBit(0b110101010, 5, 2) == 0b110111000;
    }

}
