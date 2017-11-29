package org.wcong.algorithm.ctci;

import org.junit.Test;
import org.wcong.algorithm.ctci.moderate.FactorialZeros;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 29/11/2017
 */
public class FactorialZerosTest {

    @Test
    public void testTrailZero() {
        FactorialZeros factorialZeros = new FactorialZeros();
        assert factorialZeros.trailZeros(35) == 8;
        assert factorialZeros.trailZeros(126) == 31;
    }
}
