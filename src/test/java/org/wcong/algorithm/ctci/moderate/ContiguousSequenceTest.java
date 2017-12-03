package org.wcong.algorithm.ctci.moderate;

import org.junit.Test;
import org.wcong.algorithm.ctci.moderate.ContiguousSequence;

import java.util.Arrays;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 30/11/2017
 */
public class ContiguousSequenceTest {

    @Test
    public void testLargestSequence() {
        ContiguousSequence solution = new ContiguousSequence();
        int[] array = new int[]{2, -8, 3, -2, 4, -10};
        assert Arrays.equals(solution.largestSequence(array), new int[]{2, 4});
    }

}
