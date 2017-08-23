package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 07/08/2017
 */
public class ClosestPalindromeTest {

    @Test
    public void testNearestPalindromic() {
        ClosestPalindrome solution = new ClosestPalindrome();
        Assert.assertTrue(solution.nearestPalindromic("123").equals("121"));
        Assert.assertTrue(solution.nearestPalindromic("1").equals("0"));
        Assert.assertTrue(solution.nearestPalindromic("10").equals("9"));
    }

}
