package org.wcong.algorithm.epi.array.onedimension;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 11/03/2018
 */
public class DeleteDuplicatesInSortedArrayTest {

    @Test
    public void testDelete() {
        DeleteDuplicatesInSortedArray solution = new DeleteDuplicatesInSortedArray();
        int[] array = new int[]{1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 9};
        solution.delete(array);
        assert Arrays.equals(array, new int[]{1, 2, 3, 4, 5, 6, 7, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    }

}
