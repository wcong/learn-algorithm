package org.wcong.algorithm.leetcode.array;

/**
 * Follow up for "Find Minimum in Rotated Sorted Array":
 * What if duplicates are allowed?
 * Would this affect the run-time complexity? How and why?
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * Find the minimum element.
 * The array may contain duplicates.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 24/07/2017
 */
public class MinimumInRotatedSortedArrayII {

    public int findMinDivideConquer(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        return min(nums, nums[0], 0, nums.length - 1);
    }

    private int min(int[] nums, int compare, int start, int end) {
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] > compare) {
                start = middle + 1;
            } else if (nums[middle] < compare) {
                end = middle;
            } else {
                int leftMin = min(nums, compare, start, middle);
                int rightMin = min(nums, compare, middle + 1, end);
                return leftMin > rightMin ? rightMin : leftMin;
            }
        }
        return nums[start];
    }

}
