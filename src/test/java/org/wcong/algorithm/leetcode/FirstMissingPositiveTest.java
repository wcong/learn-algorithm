package org.wcong.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 22/06/2017
 */
public class FirstMissingPositiveTest {

    @Test
    public void testFirstMissingPositive() {
        FirstMissingPositive solution = new FirstMissingPositive();
        Assert.assertTrue(solution.firstMissingPositive(new int[]{1, 2, 0}) == 3);
        Assert.assertTrue(solution.firstMissingPositive(new int[]{3, 4, -1, 1}) == 2);
    }

}
