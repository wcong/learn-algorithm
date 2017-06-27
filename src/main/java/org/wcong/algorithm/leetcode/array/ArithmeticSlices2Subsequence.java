package org.wcong.algorithm.leetcode.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * A sequence of numbers is called arithmetic
 * if it consists of at least three elements and if the difference between any two consecutive elements is the same.
 * For example, these are arithmetic sequences:
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 * The following sequence is not arithmetic.
 * 1, 1, 2, 5, 7
 * A zero-indexed array A consisting of N numbers is given.
 * A subsequence slice of that array is any sequence of integers (P0, P1, ..., Pk) such that 0 ≤ P0 < P1 < ... < Pk < N.
 * A subsequence slice (P0, P1, ..., Pk) of array A is called arithmetic if the sequence A[P0], A[P1], ..., A[Pk-1], A[Pk] is arithmetic.
 * In particular, this means that k ≥ 2.
 * The function should return the number of arithmetic subsequence slices in the array A.
 * The input contains N integers. Every integer is in the range of -231 and 231-1 and 0 ≤ N ≤ 1000.
 * The output is guaranteed to be less than 231-1.
 * Input: [2, 4, 6, 8, 10]
 * Output: 7
 * Explanation:
 * All arithmetic subsequence slices are:
 * [2,4,6]
 * [4,6,8]
 * [6,8,10]
 * [2,4,6,8]
 * [4,6,8,10]
 * [2,4,6,8,10]
 * [2,6,10]
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 26/06/2017
 */
public class ArithmeticSlices2Subsequence {

    private int nums;

    public int numberOfArithmeticSlicesBruteForce(int[] A) {
        nums = 0;
        recursiveArray(A, 0, new int[0]);
        return nums;
    }


    public int numberOfArithmeticSlicesDp(int[] A) {
        int num = 0;
        Map<Integer, List<Integer>> indexListMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            List<Integer> indexList = indexListMap.get(A[i]);
            if (indexList == null) {
                indexList = new LinkedList<>();
                indexListMap.put(A[i], indexList);
            }
            indexList.add(i);
        }
        int end = A.length - 1;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                int difference = A[j] - A[i];
                int next = A[j] + difference;
                List<Integer> indexList = indexListMap.get(next);
                if (indexList == null) {
                    continue;
                }
                for (int index : indexList) {
                    nums += 1;
                }
            }
        }
        return 0;
    }

    private void recursiveArray(int[] A, int index, int[] currentArray) {
        if (index >= A.length) {
            return;
        }
        recursiveArray(A, index + 1, currentArray);
        int[] newArray = new int[currentArray.length + 1];
        System.arraycopy(currentArray, 0, newArray, 0, currentArray.length);
        newArray[currentArray.length] = A[index];
        if (isArithmetic(newArray)) {
            nums += 1;
        }
        recursiveArray(A, index + 1, newArray);
    }

    private boolean isArithmetic(int[] array) {
        if (array.length < 3) {
            return false;
        }
        int difference = array[0] - array[1];
        for (int i = 2; i < array.length; i++) {
            if (array[i - 1] - array[i] != difference) {
                return false;
            }
        }
        return true;
    }
}
