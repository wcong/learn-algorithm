package org.wcong.algorithm.epi.array.onedimension;

/**
 * Write a program which takes as input a sorted array and updates it
 * so that all duplicates have been removed
 * and the remaining elements have been shifted left to fill the emptied indices.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 11/03/2018
 */
public class DeleteDuplicatesInSortedArray {

    public void delete(int[] array) {
        int index = 1;
        int number = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == number) {
                continue;
            }
            array[index] = array[i];
            index += 1;
            number = array[i];
        }
        for (int i = index; i < array.length; i++) {
            array[i] = 0;
        }
    }

}
