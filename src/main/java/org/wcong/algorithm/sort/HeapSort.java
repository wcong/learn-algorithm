package org.wcong.algorithm.sort;

public class HeapSort {

    public void heapSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapify(array, i, 0);
        }
    }

    private void heapify(int[] array, int n, int i) {
        int middle = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && array[middle] < array[left]) {
            middle = left;
        }
        if (right < n && array[middle] < array[right]) {
            middle = right;
        }
        if (middle != i) {
            int temp = array[i];
            array[i] = array[middle];
            array[middle] = temp;
            heapify(array, n, i);
        }
    }

}
