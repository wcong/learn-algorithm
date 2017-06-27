package org.wcong.algorithm.leetcode;

import java.util.*;

/**
 * Given a list of unique words,
 * find all pairs of distinct indices (i, j) in the given list,
 * so that the concatenation of the two words,
 * i.e. words[i] + words[j] is a palindrome.
 * Example 1:
 * Given words = ["bat", "tab", "cat"]
 * Return [[0, 1], [1, 0]]
 * The palindromes are ["battab", "tabbat"]
 * Example 2:
 * Given words = ["abcd", "dcba", "lls", "s", "sssll"]
 * Return [[0, 1], [1, 0], [3, 2], [2, 4]]
 * The palindromes are ["dcbaabcd", "abcddcba", "slls", "llssssll"]
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 23/06/2017
 */
public class PalindromePairs {
    public List<List<Integer>> palindromePairsBruteForce(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPalindromes(words[i] + words[j])) {
                    result.add(Arrays.asList(i, j));
                }
                if (isPalindromes(words[j] + words[i])) {
                    result.add(Arrays.asList(j, i));
                }
            }
        }
        return result;
    }

    private boolean isPalindromes(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start <= end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String, Integer> stringIndex = new HashMap<>(words.length, 1);
        for (int i = 0; i < words.length; i++) {
            stringIndex.put(words[i], i);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Integer palindromeIndex;
            String reversWord = reversWord(word);
            palindromeIndex = stringIndex.get(reversWord);
            if (palindromeIndex != null && palindromeIndex != i) {
                result.add(Arrays.asList(i, palindromeIndex));
            }
            if (reversWord.length() == 1) {
                continue;
            }
            palindromeIndex = stringIndex.get(reversWord.substring(1));
            if (palindromeIndex != null && palindromeIndex != i) {
                result.add(Arrays.asList(i, palindromeIndex));
            }
            char sameChar = reversWord.charAt(0);
            int sameIndex = 0;
            for (int charIndex = 1; charIndex < reversWord.length(); charIndex++) {
                if (sameChar == reversWord.charAt(charIndex)) {
                    sameIndex = charIndex;
                } else {
                    break;
                }
            }
            for (int charIndex = 2; charIndex <= sameIndex; charIndex++) {
                palindromeIndex = stringIndex.get(reversWord.substring(charIndex));
                if (palindromeIndex != null && palindromeIndex != i) {
                    result.add(Arrays.asList(i, palindromeIndex));
                }
            }
        }
        return result;
    }

    private String reversWord(String word) {
        char[] charArray = new char[word.length()];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = word.charAt(charArray.length - i - 1);
        }
        return new String(charArray);
    }
}
