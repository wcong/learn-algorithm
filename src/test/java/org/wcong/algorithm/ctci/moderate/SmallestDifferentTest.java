package org.wcong.algorithm.ctci.moderate;

import org.junit.Test;
import org.wcong.algorithm.ctci.moderate.SmallestDifferent;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 29/11/2017
 */
public class SmallestDifferentTest {

    @Test
    public void testSmallestDifferent() {
        SmallestDifferent solution = new SmallestDifferent();
        assert solution.smallestDifferent(new int[]{1, 3, 15, 11, 2}, new int[]{23, 127, 235, 19, 8}) == 3;
    }

}
