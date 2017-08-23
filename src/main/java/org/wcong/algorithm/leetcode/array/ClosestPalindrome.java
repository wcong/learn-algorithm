package org.wcong.algorithm.leetcode.array;

/**
 * Given an integer n, find the closest integer (not including itself), which is a palindrome.
 * The 'closest' is defined as absolute difference minimized between two integers.
 * Example 1:
 * Input: "123"
 * Output: "121"
 * Note: The input n is a positive integer represented by string,
 * whose length will not exceed 18.
 * If there is a tie, return the smaller one as answer.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 07/08/2017
 */
public class ClosestPalindrome {
    public String nearestPalindromic(String n) {
        if (isPalindromic(n)) {
            char[] numbers = n.toCharArray();
            if ((n.length() & 1) == 1) {
                numbers[numbers.length / 2] -= 1;
            } else {
                numbers[(numbers.length / 2) + 1] -= 1;
                numbers[numbers.length / 2] -= 1;
            }
            return new String(numbers);
        }
        char[] numbers = n.toCharArray();
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] != numbers[end]) {
                numbers[end] = numbers[start];
            }
            start += 1;
            end -= 1;
        }
        return new String(numbers);
    }

    private boolean isPalindromic(String n) {
        char[] numbers = n.toCharArray();
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] != numbers[end]) {
                return false;
            }
        }
        return true;
    }
}
