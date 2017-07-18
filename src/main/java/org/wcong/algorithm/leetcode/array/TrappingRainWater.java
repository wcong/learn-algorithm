package org.wcong.algorithm.leetcode.array;

import java.util.LinkedList;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * strip first 0 split,first maximum
 * 1 find bigger,inner subtract by max
 * 2 not find bigger,less bigger
 * 1 less add
 * 2 bigger find less add
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 28/06/2017
 */
public class TrappingRainWater {
    public int trapGreed(int[] height) {
        int trap = 0;
        LinkedList<Integer> indexList = new LinkedList<>();
        indexList.add(height[0]);
        for (int i = 1; i < height.length; i++) {
            if (height[i] <= indexList.peek()) {
                indexList.add(i);
            } else {
                indexList.removeLast();
                boolean isBigger = false;
                int index;
                int max;
                while (!indexList.isEmpty()) {
                    index = indexList.pollLast();
                    if (height[index] >= height[i]) {
                        isBigger = true;
                        break;
                    }
                }
            }
        }
        return trap;
    }
}
