package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 17/07/2017
 */
public class MaximalRectangleTest {

    @Test
    public void testMaximalRectangle() {
        char[][] matrix = {{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};
        MaximalRectangle solution = new MaximalRectangle();
        Assert.assertTrue(solution.maximalRectangleGreed(matrix) == 6);
    }

}
