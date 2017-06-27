package org.wcong.algorithm.leetcode.array;

import java.util.*;

/**
 * Given two words (beginWord and endWord)and a dictionary's word list
 * find all shortest transformation sequence(s) from beginWord to endWord,
 * such that:
 * 1.Only one letter can be changed at a time
 * 2.Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 * For example,
 * Given:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * return [
 * ["hit","hot","dot","dog","cog"],
 * ["hit","hot","lot","log","cog"]
 * ]
 * Note:
 * Return an empty list if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * You may assume no duplicates in the word list.
 * You may assume beginWord and endWord are non-empty and are not the same.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 27/06/2017
 */
public class WordLadderII {
    public List<List<String>> findLaddersBruteForce(String beginWord, String endWord, List<String> wordList) {
        Map<String, List<String>> oneDistanceMap = new HashMap<>();
        if (!wordList.contains(endWord)) {
            return Collections.emptyList();
        }
        wordList.remove(beginWord);
        List<String> beginOneDistanceList = new LinkedList<>();
        oneDistanceMap.put(beginWord, beginOneDistanceList);
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            if (isOneWordDifferent(beginWord, word)) {
                beginOneDistanceList.add(word);
            }
            for (int j = i + 1; j < wordList.size(); j++) {
                String compareWord = wordList.get(j);
                if (!isOneWordDifferent(word, compareWord)) {
                    continue;
                }
                List<String> oneDistanceList = oneDistanceMap.get(word);
                if (oneDistanceList == null) {
                    oneDistanceList = new LinkedList<>();
                    oneDistanceMap.put(word, oneDistanceList);
                }
                oneDistanceList.add(compareWord);
                List<String> compareList = oneDistanceMap.get(compareWord);
                if (compareList == null) {
                    compareList = new LinkedList<>();
                    oneDistanceMap.put(compareWord, compareList);
                }
                compareList.add(word);
            }
        }
        List<List<String>> result = new LinkedList<>();
        findTransfer(beginWord, endWord, Collections.singletonList(beginWord), oneDistanceMap, result);
        return result;
    }

    private void findTransfer(String currentWord, String endWord, List<String> currentList, Map<String, List<String>> oneDistanceMap, List<List<String>> result) {
        if (currentWord.equals(endWord)) {
            if (result.isEmpty()) {
                result.add(currentList);
            } else {
                if (currentList.size() < result.get(0).size()) {
                    result.clear();
                    result.add(currentList);
                } else if (currentList.size() == result.get(0).size()) {
                    result.add(currentList);
                }
            }
            return;
        }
        if (!result.isEmpty() && currentList.size() >= result.get(0).size()) {
            return;
        }
        List<String> oneDistanceList = oneDistanceMap.get(currentWord);
        if (oneDistanceList == null || oneDistanceList.isEmpty()) {
            return;
        }
        for (String oneDistance : oneDistanceList) {
            if (currentList.contains(oneDistance)) {
                continue;
            }
            List<String> wordList = new LinkedList<>(currentList);
            wordList.add(oneDistance);
            findTransfer(oneDistance, endWord, wordList, oneDistanceMap, result);
        }
    }

    private boolean isOneWordDifferent(String word, String compare) {
        int different = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != compare.charAt(i)) {
                different += 1;
            }
        }
        return different == 1;
    }
}
