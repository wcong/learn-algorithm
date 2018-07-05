package org.wcong.algorithm.sort;

public class MergeSort {

    public void mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    private void mergeSort(int[] array, int[] temp, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = (start + end) / 2;
        mergeSort(array, temp, start, middle);
        mergeSort(array, temp, middle + 1, end);
        int leftStart = start;
        int rightStart = middle + 1;
        for (int i = start; i <= end; i++) {
            if (array[leftStart] < array[rightStart]) {
                temp[i] = array[leftStart];
                leftStart += 1;
            } else {
                temp[i] = array[rightStart];
                rightStart += 1;
            }
        }
        for (int i = start; i <= end; i++) {
            array[start] = temp[start];
        }
    }

}
