package org.wcong.algorithm.ctci.moderate;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * given two straight line segments(represented as a start point and a end point)
 * computer the point of interception if any
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 28/11/2017
 */
public class Interception {

    @Data
    @AllArgsConstructor
    public static class Line {
        private Point start;
        private Point end;
    }

    @Data
    @AllArgsConstructor
    private static class Point {
        private int x;
        private int y;
    }

    public Point interception(Line line1, Line line2) {
        return null;
    }

}
