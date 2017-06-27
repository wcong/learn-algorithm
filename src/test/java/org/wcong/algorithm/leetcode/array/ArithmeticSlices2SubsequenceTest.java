package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 26/06/2017
 */
public class ArithmeticSlices2SubsequenceTest {

    @Test
    public void testNumberOfArithmeticSlices() {
        ArithmeticSlices2Subsequence solution = new ArithmeticSlices2Subsequence();
        Assert.assertTrue(solution.numberOfArithmeticSlicesBruteForce(new int[]{2, 4, 6, 8, 10}) == 7);
    }

}
