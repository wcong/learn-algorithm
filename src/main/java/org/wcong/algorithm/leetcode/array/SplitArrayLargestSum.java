package org.wcong.algorithm.leetcode.array;

/**
 * Given an array which consists of non-negative integers and an integer m,
 * you can split the array into m non-empty continuous subarrays.
 * Write an algorithm to minimize the largest sum among these m subarrays.
 * Note:
 * If n is the length of array, assume the following constraints are satisfied:
 * 1 ≤ n ≤ 1000
 * 1 ≤ m ≤ min(50, n)
 * Examples:
 * Input:nums = [7,2,5,10,8]m = 2
 * Output:18
 * Explanation:
 * There are four ways to split nums into two subarrays.
 * The best way is to split it into [7,2,5] and [10,8],
 * where the largest sum among the two subarrays is only 18.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 27/07/2017
 */
public class SplitArrayLargestSum {

    public int splitArrayDp(int[] nums, int m) {
        int[][] result = new int[m][3];
        int end = m - 1;
        int start = 0;
        for (; start < end; start++) {
            result[start][0] = start;
            result[start][1] = start;
            result[start][2] = nums[start];
        }
        result[m - 1][0] = start;
        result[m - 1][1] = nums.length - 1;
        for (; start < nums.length; start++) {
            result[m - 1][2] += nums[start];
        }
        boolean isFinished;
        do {
            isFinished = true;
            for (int i = m - 1; i > 0; i--) {
                int[] current = result[i];
                int[] last = result[i - 1];
                int max = current[2] > last[2] ? current[2] : last[2];
                for (int j = current[0]; j < current[1]; j++) {
                    int tempLast = last[2] + nums[j];
                    int tempCurrent = current[2] - nums[j];
                    int tempMax = tempCurrent > tempLast ? tempCurrent : tempLast;
                    if (tempMax < max) {
                        max = tempMax;
                        last[1] = j;
                        current[0] = j + 1;
                        last[2] = tempLast;
                        current[2] = tempCurrent;
                        isFinished = false;
                    } else {
                        break;
                    }
                }
            }
        } while (!isFinished);
        int max = 0;
        for (int[] soloResult : result) {
            if (soloResult[2] > max) {
                max = soloResult[2];
            }
        }
        return max;
    }

}
