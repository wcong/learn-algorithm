package org.wcong.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 23/06/2017
 */
public class PalindromePairsTest {

    @Test
    public void testPalindromePairs() {
        String[] word1 = {"bat", "tab", "cat"};
        List<List<Integer>> result1 = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 0));
        String[] word2 = {"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> result2 = Arrays.asList(Arrays.asList(0, 1),
                Arrays.asList(1, 0),
                Arrays.asList(3, 2),
                Arrays.asList(2, 4));
        PalindromePairs solution = new PalindromePairs();
        Assert.assertTrue(isListEqual(solution.palindromePairs(word1), result1));
        Assert.assertTrue(isListEqual(solution.palindromePairs(word2), result2));
    }

    private boolean isListEqual(List<List<Integer>> result1, List<List<Integer>> result2) {
        if (result1 == result2) {
            return true;
        }
        if (result1 == null || result2 == null) {
            return false;
        }
        if (result1.size() != result2.size()) {
            return false;
        }
        int length = result1.size();
        for (int i = 0; i < length; i++) {
            List<Integer> index1 = result1.get(i);
            List<Integer> index2 = result2.get(i);
            if (index1.size() != 2 || index2.size() != 2) {
                return false;
            }
            if (index1.get(0).intValue() != index2.get(0)) {
                return false;
            }
            if (index1.get(1).intValue() != index2.get(1)) {
                return false;
            }
        }
        return true;
    }

}
