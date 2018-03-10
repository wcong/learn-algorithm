package org.wcong.algorithm.epi.array.onedimension;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 10/03/2018
 */
public class DutchNationalFlagProblemTest {

    @Test
    public void testRearrange() {
        DutchNationalFlagProblem solution = new DutchNationalFlagProblem();
        assert Arrays.equals(solution.rearrange(new int[]{4, 1, 2, 3, 5, 6, 7}, 0), new int[]{3, 1, 2, 4, 5, 6, 7});
    }

}
