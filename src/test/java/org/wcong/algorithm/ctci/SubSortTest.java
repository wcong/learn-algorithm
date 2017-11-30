package org.wcong.algorithm.ctci;

import org.junit.Test;
import org.wcong.algorithm.ctci.moderate.SubSort;

import java.util.Arrays;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 30/11/2017
 */
public class SubSortTest {

    @Test
    public void testSubSort() {
        SubSort subSort = new SubSort();
        int[] array = new int[]{1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        assert Arrays.equals(subSort.subSort(array), new int[]{3, 9});
    }

}
