package org.wcong.algorithm.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 30/08/2017
 */
public class LongestValidParenthesesTest {

    @Test
    public void testLongestValidParentheses() {
        LongestValidParentheses solution = new LongestValidParentheses();
        Assert.assertTrue(solution.longestValidParentheses("(()") == 2);
        Assert.assertTrue(solution.longestValidParentheses(")()())") == 4);
        Assert.assertTrue(solution.longestValidParentheses("((((()())") == 6);
        Assert.assertTrue(solution.longestValidParentheses(")())((()))") == 6);
        Assert.assertTrue(solution.longestValidParentheses("()(()") == 2);
        Assert.assertTrue(solution.longestValidParentheses("(()))())(") == 4);
        Assert.assertTrue(solution.longestValidParentheses("(()(((()") == 2);
    }

}
