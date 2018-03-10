package org.wcong.algorithm.epi.array.onedimension;

/**
 * Write a program that takes an array A and an index i into A,
 * and rearranges the elements such that
 * all elements less than A[i] (the "pivot") appear first,
 * followed by elements equal to the pivot,
 * followed by elements greater than the pivot
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 27/02/2018
 */
public class DutchNationalFlagProblem {

    public int[] rearrange(int[] array, int index) {
        int pivot = array[index];
        int lessIndex = 0;
        int moreIndex = array.length - 1;
        while (lessIndex < moreIndex) {
            if (array[lessIndex] < pivot) {
                lessIndex += 1;
                continue;
            }
            if (array[moreIndex] > pivot) {
                moreIndex -= 1;
                continue;
            }
            int temp = array[lessIndex];
            array[lessIndex] = array[moreIndex];
            array[moreIndex] = temp;
            lessIndex += 1;
            moreIndex -= 1;
        }
        return array;
    }

}
