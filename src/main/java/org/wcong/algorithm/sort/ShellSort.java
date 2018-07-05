package org.wcong.algorithm.sort;

public class ShellSort {

    public void shellSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int step = array.length / 2;
        while (step > 0) {
            for (int i = step; i < array.length; i++) {
                int temp = array[i];
                int index = i;
                while (index - step >= 0 && temp < array[index - step]) {
                    array[index] = array[i - step];
                    index -= step;
                }
                array[index] = temp;
            }
            step /= 2;
        }
    }
}
