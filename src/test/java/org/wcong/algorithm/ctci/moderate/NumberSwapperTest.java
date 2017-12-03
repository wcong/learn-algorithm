package org.wcong.algorithm.ctci.moderate;

import org.junit.Test;
import org.wcong.algorithm.ctci.moderate.NumberSwapper;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 28/11/2017
 */
public class NumberSwapperTest {

    @Test
    public void testSwapNumber() {
        NumberSwapper.Numbers numbers = new NumberSwapper.Numbers(1, 3);
        NumberSwapper numberSwapper = new NumberSwapper();
        numberSwapper.swapNumber(numbers);
        assert numbers.a == 3;
        assert numbers.b == 1;
    }

}
