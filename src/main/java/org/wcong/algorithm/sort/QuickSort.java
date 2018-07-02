package org.wcong.algorithm.sort;

public class QuickSort {

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int start, int end) {
        int pivotal = pivotal(array, start, end);
        if (pivotal > start) {
            quickSort(array, start, pivotal);
        }
        if (pivotal < end) {
            quickSort(array, pivotal, end);
        }
    }

    private int pivotal(int[] array, int start, int end) {
        if (start >= end) {
            return start;
        }
        int middleIndex = (start + end) / 2;
        int middle = array[middleIndex];
        while (start < end) {
            while (array[start] < middle) {
                start++;
            }
            while (array[end] >= middle) {
                middle--;
            }
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return start;
    }

}
