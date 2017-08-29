package org.wcong.algorithm.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 23/08/2017
 */
public class WordSearchIITest {

    @Test
    public void testFindWords() {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = {"oath", "pea", "eat", "rain"};
        WordSearchII solution = new WordSearchII();
        List<String> result = solution.findWords(board, words);
        Collections.sort(result);
        Assert.assertArrayEquals(result.toArray(), new String[]{"eat", "oath"});
    }


}
