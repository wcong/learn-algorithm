package org.wcong.algorithm.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 21/08/2017
 */
public class DecodeWaysIITest {

    @Test
    public void testNumDecodings() {
        DecodeWaysII solution = new DecodeWaysII();
        Assert.assertTrue(solution.numDecodings("*") == 9);
        Assert.assertTrue(solution.numDecodings("1*") == 18);
        Assert.assertTrue(solution.numDecodings("*10*1") == 99);
        Assert.assertTrue(solution.numDecodings("********************") == 104671669);
    }
}
