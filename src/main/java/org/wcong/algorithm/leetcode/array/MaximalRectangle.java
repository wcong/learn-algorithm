package org.wcong.algorithm.leetcode.array;

/**
 * Given a 2D binary matrix filled with 0's and 1's,
 * find the largest rectangle containing only 1's and return its area.
 * For example, given the following matrix:
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * Return 6.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 14/07/2017
 */
public class MaximalRectangle {


    public int maximalRectangleGreed(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int[][] horizontalIndex = new int[matrix.length][matrix[0].length];
        int[][] verticalIndex = new int[matrix[0].length][matrix.length];
        int maxRectangle = 0;
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                if (matrix[x][y] == '0') {
                    horizontalIndex[x][y] = y;
                    verticalIndex[y][x] = x;
                } else {
                    horizontalIndex[x][y] = y == 0 ? -1 : horizontalIndex[x][y - 1];
                    verticalIndex[y][x] = x == 0 ? -1 : verticalIndex[y][x - 1];
                    int endX = x == 0 ? -1 : verticalIndex[y][x - 1];
                    int maxY = -1;
                    for (int tempX = x; tempX > endX; tempX--) {
                        maxY = horizontalIndex[tempX][y] > maxY ? horizontalIndex[tempX][y] : maxY;
                        int rectangle = (x - tempX + 1) * (y - maxY);
                        if (rectangle > maxRectangle) {
                            maxRectangle = rectangle;
                        }
                    }
                }
            }
        }
        return maxRectangle;
    }
}
