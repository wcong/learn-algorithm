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

    public List<List<String>> findLaddersDp(String beginWord, String endWord, List<String> wordList) {
        wordList.remove(beginWord);
        int endWordIndex = wordList.indexOf(endWord);
        if (endWordIndex < 0) {
            return Collections.emptyList();
        }
        int[][] lastIndex = new int[wordList.size()][];
        int[] distance = new int[wordList.size()];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        Map<String, Set<Integer>> oneDistanceMap = new HashMap<>();
        Set<String> usedWord = new HashSet<>();
        Stack<Integer> indexStack = new Stack<>();
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            if (isOneWordDifferent(beginWord, word)) {
                indexStack.push(i);
                lastIndex[i] = new int[]{-1};
                distance[i] = 1;
                usedWord.add(word);
            }
        }
        while (!indexStack.isEmpty()) {
            int index = indexStack.pop();
            String currentWord = wordList.get(index);
            if (usedWord.contains(currentWord)) {
                continue;
            }
            Set<Integer> oneDistance = oneDistanceMap.get(currentWord);
            if (oneDistance == null) {
                oneDistance = new HashSet<>();
                oneDistanceMap.put(currentWord, oneDistance);
                for (int i = 0; i < wordList.size(); i++) {
                    String word = wordList.get(i);
                    if (isOneWordDifferent(currentWord, word)) {
                        oneDistance.add(i);
                    }
                }
            }
            for (Integer oneDistanceIndex : oneDistance) {
                if (distance[index] + 1 < distance[oneDistanceIndex]) {
                    distance[oneDistanceIndex] = distance[index] + 1;
                    lastIndex[oneDistanceIndex] = new int[]{index};
                    indexStack.push(oneDistanceIndex);
                } else if (distance[index] + 1 == distance[oneDistanceIndex]) {
                    boolean isContain = false;
                    for (int existIndex : lastIndex[oneDistanceIndex]) {
                        if (existIndex == index) {
                            isContain = true;
                            break;
                        }
                    }
                    if (isContain) {
                        continue;
                    }
                    int[] lastIndexList = new int[lastIndex[oneDistanceIndex].length + 1];
                    System.arraycopy(lastIndex[oneDistanceIndex], 0, lastIndexList, 0, lastIndex[oneDistanceIndex].length);
                    lastIndexList[lastIndex[oneDistanceIndex].length] = index;
                    lastIndex[oneDistanceIndex] = lastIndexList;
                    indexStack.push(oneDistanceIndex);
                }
            }
        }

        List<List<String>> result = new LinkedList<>();
        if (lastIndex[endWordIndex] != null) {
            findPath(lastIndex, wordList, endWordIndex, new LinkedList<>(), result);
        }
        for (List<String> soloResult : result) {
            soloResult.add(0, beginWord);
        }
        return result;
    }

    private void findPath(int[][] lastIndexes, List<String> wordList, int index, List<String> temp, List<List<String>> result) {
        if (index == -1) {
            result.add(temp);
            return;
        }
        temp.add(0, wordList.get(index));
        int[] tempLastIndexes = lastIndexes[index];
        if (tempLastIndexes.length == 1) {
            findPath(lastIndexes, wordList, tempLastIndexes[0], temp, result);
        } else {
            for (int tempIndex : tempLastIndexes) {
                List<String> path = new LinkedList<>(temp);
                findPath(lastIndexes, wordList, tempIndex, path, result);
            }
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
