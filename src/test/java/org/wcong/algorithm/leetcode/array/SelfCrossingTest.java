package org.wcong.algorithm.leetcode.array;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 01/08/2017
 */
public class SelfCrossingTest {

    @Test
    public void testSelfCrossing() {
        SelfCrossing selfCrossing = new SelfCrossing();
        Assert.assertTrue(selfCrossing.isSelfCrossing(new int[]{2, 1, 1, 2}));
        Assert.assertTrue(selfCrossing.isSelfCrossing(new int[]{1, 2, 3, 4}));
        Assert.assertTrue(selfCrossing.isSelfCrossing(new int[]{1, 1, 1, 1}));
    }

}
