package org.wcong.algorithm.epi.array.onedimension;

import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 11/03/2018
 */
public class AdvanceThroughArrayTest {

    @Test
    public void testThrough() {
        AdvanceThroughArray solution = new AdvanceThroughArray();
        assert solution.through(new int[]{2, 4, 1, 1, 0, 2, 3});
        assert !solution.through(new int[]{2, 4, 1, 1, 0, 0, 3});
    }

}
