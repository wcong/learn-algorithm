package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 28/06/2017
 */
public class TrappingRainWaterTest {

    @Test
    public void testTrap() {
        TrappingRainWater solution = new TrappingRainWater();
        Assert.assertTrue(solution.trapGreed(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}) == 6);
    }

}
