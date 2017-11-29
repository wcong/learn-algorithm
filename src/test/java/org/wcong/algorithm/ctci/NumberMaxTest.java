package org.wcong.algorithm.ctci;

import org.junit.Test;
import org.wcong.algorithm.ctci.moderate.NumberMax;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 29/11/2017
 */
public class NumberMaxTest {

    @Test
    public void testMaxNumber() {
        NumberMax numberMax = new NumberMax();
        assert numberMax.max(1, 3) == 3;
        assert numberMax.max(3, 53) == 53;
    }

}
