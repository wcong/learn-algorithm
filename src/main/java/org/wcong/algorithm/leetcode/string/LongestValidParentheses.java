package org.wcong.algorithm.leetcode.string;

import java.util.Stack;

/**
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * Another example is ")()())",
 * where the longest valid parentheses substring is "()()", which has length = 4.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 29/08/2017
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }
        char[] chars = s.toCharArray();
        Stack<Integer> characterStack = new Stack<>();
        int[] countDp = new int[chars.length];
        int maxCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (characterStack.isEmpty() && chars[i] == ')') {
                continue;
            }
            if (chars[i] == '(') {
                characterStack.push(i);
            } else {
                int index = characterStack.pop();
                countDp[i] += 2;
                countDp[i] += countDp[i - 1];
                if (index > 0) {
                    countDp[i] += countDp[index - 1];
                }
                maxCount = countDp[i] > maxCount ? countDp[i] : maxCount;
            }
        }
        return maxCount;
    }
}
