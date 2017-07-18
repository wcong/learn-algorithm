package org.wcong.algorithm.leetcode.array;

import java.util.Stack;

/**
 * Given n non-negative integers representing the histogram's bar height
 * where the width of each bar is 1,
 * find the area of largest rectangle in the histogram.
 * For example,
 * Given heights = [2,1,5,6,2,3],
 * return 10.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 10/07/2017
 */
public class LargestRectangleInHistogram {
    public int largestRectangleAreaDp(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int maxHeight = 0;
        int[][] minHeight = new int[heights.length][heights.length];
        for (int i = 0; i < heights.length; i++) {
            minHeight[i][i] = heights[i];
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
            for (int j = i - 1; j >= 0; j--) {
                minHeight[i][j] = heights[i] > minHeight[i - 1][j] ? minHeight[i - 1][j] : heights[i];
                int rectangleArea = (i - j + 1) * minHeight[i][j];
                if (rectangleArea > maxHeight) {
                    maxHeight = rectangleArea;
                }
            }
        }
        return maxHeight;
    }

    public int largestRectangleGreed(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                    stack.pop();
                }
                int area = (i - (stack.isEmpty() ? 0 : stack.peek())) * heights[i];
                if (area > maxArea) {
                    maxArea = area;
                }
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            int area = (heights.length - index) * heights[index];
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    public int largestRectangleDivideAndConquer(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        return largestRectangleDivideAndConquer(heights, 0, heights.length - 1);
    }


    public int largestRectangleDivideAndConquer(int[] heights, int start, int end) {
        if (start > end) {
            return 0;
        }
        int minHeightIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (heights[i] < heights[minHeightIndex]) {
                minHeightIndex = i;
            }
        }
        int currentRectangle = (end - start + 1) * heights[minHeightIndex];
        int leftRectangle = largestRectangleDivideAndConquer(heights, start, minHeightIndex - 1);
        int rightRectangle = largestRectangleDivideAndConquer(heights, minHeightIndex + 1, end);
        int largest = currentRectangle > leftRectangle ? currentRectangle : leftRectangle;
        largest = largest > rightRectangle ? largest : rightRectangle;
        return largest;
    }
}
