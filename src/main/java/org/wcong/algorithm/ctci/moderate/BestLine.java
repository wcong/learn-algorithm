package org.wcong.algorithm.ctci.moderate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * given a two-dimension graph with points in it
 * find a line passes the most number of point
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 30/11/2017
 */
public class BestLine {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Point {
        private int x;
        private int y;

    }

    // tips
    // 1 brute force:
    //  O(n*n)
    public List<Point> bestLine(List<Point> pointList) {
        List<Point> bestLine = Collections.emptyList();
        for (int i = 0; i < pointList.size() - 1; i++) {
            int leftY = pointList.get(i + 1).y - pointList.get(i).y;
            int leftX = pointList.get(i + 1).x - pointList.get(i).x;
            List<Point> currentLine = new LinkedList<>();
            currentLine.add(pointList.get(i));
            currentLine.add(pointList.get(i + 1));
            for (int j = i + 2; j < pointList.size(); j++) {
                int currentLeftY = pointList.get(j).y - pointList.get(i).y;
                int currentLeftX = pointList.get(j).x - pointList.get(i).x;
                if (leftY * currentLeftX == leftX * currentLeftY) {
                    currentLine.add(pointList.get(j));
                }
            }
            if (currentLine.size() > bestLine.size()) {
                bestLine = currentLine;
            }
        }
        return bestLine;
    }


}
