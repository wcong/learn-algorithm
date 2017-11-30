package org.wcong.algorithm.ctci;

import org.junit.Test;
import org.wcong.algorithm.ctci.moderate.BestLine;

import java.util.Arrays;
import java.util.List;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 30/11/2017
 */
public class BestLineTest {

    @Test
    public void testBestLine() {
        BestLine bestLine = new BestLine();
        List<BestLine.Point> pointList = Arrays.asList(
                new BestLine.Point(1, 2),
                new BestLine.Point(3, 6),
                new BestLine.Point(2, 8),
                new BestLine.Point(4, 8)
        );
        List<BestLine.Point> resultList = Arrays.asList(
                new BestLine.Point(1, 2),
                new BestLine.Point(3, 6),
                new BestLine.Point(4, 8)
        );
        assert bestLine.bestLine(pointList).equals(resultList);
    }

}
