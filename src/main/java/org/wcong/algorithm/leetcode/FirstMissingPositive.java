package org.wcong.algorithm.leetcode;

import java.util.Arrays;

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 * Your algorithm should run in O(n) time and uses constant space.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 22/06/2017
 */
public class FirstMissingPositive {
    public int firstMissingPositiveBruteForce(int[] nums) {
        Arrays.sort(nums);
        int missing = 1;
        for (int num : nums) {
            if (num <= 0) {
                continue;
            }
            if (missing == num) {
                missing += 1;
            } else {
                return missing;
            }
        }
        return nums[nums.length - 1] + 1;
    }

    public int firstMissingPositive(int[] nums) {
        return 0;
    }
}
