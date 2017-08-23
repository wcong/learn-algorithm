package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 01/08/2017
 */
public class KInversePairsArrayTest {

    public void testInversePairsK() {
        KInversePairsArray solution = new KInversePairsArray();
        Assert.assertTrue(solution.kInversePairs(3, 0) == 1);
        Assert.assertTrue(solution.kInversePairs(3, 1) == 2);
    }

}
