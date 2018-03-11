package org.wcong.algorithm.epi.array.onedimension;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 11/03/2018
 */
public class NextPermutationTest {

    @Test
    public void testNextPermutation() {
        NextPermutation nextPermutation = new NextPermutation();
        int[] array = new int[]{9, 8, 7, 2, 4, 3, 1};
        nextPermutation.nextPermutation(array);
        assert Arrays.equals(array, new int[]{9, 8, 7, 3, 1, 2, 4});
    }

}
