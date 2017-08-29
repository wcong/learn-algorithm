package org.wcong.algorithm.leetcode.array;

import java.util.*;

/**
 * Given a 2D board and a list of words from the dictionary,find all words in the board.
 * Each word must be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once in a word.
 * For example,
 * Given words = ["oath","pea","eat","rain"] and board =
 * [
 * ['o','a','a','n'],
 * ['e','t','a','e'],
 * ['i','h','k','r'],
 * ['i','f','l','v']
 * ]
 * Return ["eat","oath"].
 * Note:You may assume that all inputs are consist of lowercase letters a-z.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 23/08/2017
 */
public class WordSearchII {

    static class CharMap {
        String word;
        Map<Character, CharMap> charMap;
    }

    public List<String> findWords(char[][] board, String[] words) {
        if (words == null || board == null) {
            return Collections.emptyList();
        }
        List<List<int[]>> charIndexArray = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            charIndexArray.add(null);
        }
        for (int rowIndex = 0; rowIndex < board.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < board[rowIndex].length; columnIndex++) {
                char currentChar = board[rowIndex][columnIndex];
                int index = currentChar - 'a';
                List<int[]> charIndex = charIndexArray.get(index);
                if (charIndex == null) {
                    charIndex = new ArrayList<>();
                    charIndexArray.set(index, charIndex);
                }
                charIndex.add(new int[]{rowIndex, columnIndex});
            }
        }
        Map<Character, CharMap> charMap = new HashMap<>();
        for (String word : words) {
            char[] wordChars = word.toCharArray();
            CharMap soloCharMap = charMap.get(wordChars[0]);
            if (soloCharMap == null) {
                soloCharMap = new CharMap();
                soloCharMap.charMap = new HashMap<>();
                charMap.put(wordChars[0], soloCharMap);
            }

            for (int i = 1; i < wordChars.length; i++) {
                if (!soloCharMap.charMap.containsKey(wordChars[i])) {
                    CharMap childCharMap = new CharMap();
                    childCharMap.charMap = new HashMap<>();
                    soloCharMap.charMap.put(wordChars[i], childCharMap);
                }
                soloCharMap = soloCharMap.charMap.get(wordChars[i]);
            }
            soloCharMap.word = word;
        }
        int[][] trace = new int[board.length][board[0].length];
        Set<String> findResult = new HashSet<>();
        for (Map.Entry<Character, CharMap> charMapEntry : charMap.entrySet()) {
            int firstIndex = charMapEntry.getKey() - 'a';
            List<int[]> findIndex = charIndexArray.get(firstIndex);
            if (findIndex == null) {
                continue;
            }
            for (int[] startIndex : findIndex) {
                trace[startIndex[0]][startIndex[1]] = 1;
                findWord(charMapEntry.getValue(), startIndex, board, trace, findResult);
                trace[startIndex[0]][startIndex[1]] = 0;
            }
        }
        return new ArrayList<>(findResult);
    }

    private void findWord(CharMap charMap, int[] boardIndex, char[][] board, int[][] trace, Set<String> findResult) {
        if (charMap.word != null) {
            findResult.add(charMap.word);
        }
        if (charMap.charMap.isEmpty()) {
            return;
        }
        for (Map.Entry<Character, CharMap> charMapEntry : charMap.charMap.entrySet()) {
            char soloChar = charMapEntry.getKey();
            CharMap soloCharMap = charMapEntry.getValue();
            if (boardIndex[0] > 0) {
                if (trace[boardIndex[0] - 1][boardIndex[1]] != 1
                        && board[boardIndex[0] - 1][boardIndex[1]] == soloChar) {
                    trace[boardIndex[0] - 1][boardIndex[1]] = 1;
                    findWord(soloCharMap, new int[]{boardIndex[0] - 1, boardIndex[1]}, board, trace, findResult);
                    trace[boardIndex[0] - 1][boardIndex[1]] = 0;
                }
            }
            if (boardIndex[1] > 0) {
                if (trace[boardIndex[0]][boardIndex[1] - 1] != 1
                        && board[boardIndex[0]][boardIndex[1] - 1] == soloChar) {
                    trace[boardIndex[0]][boardIndex[1] - 1] = 1;
                    findWord(soloCharMap, new int[]{boardIndex[0], boardIndex[1] - 1}, board, trace, findResult);
                    trace[boardIndex[0]][boardIndex[1] - 1] = 0;
                }
            }
            if (boardIndex[0] + 1 < board.length) {
                if (trace[boardIndex[0] + 1][boardIndex[1]] != 1
                        && board[boardIndex[0] + 1][boardIndex[1]] == soloChar) {
                    trace[boardIndex[0] + 1][boardIndex[1]] = 1;
                    findWord(soloCharMap, new int[]{boardIndex[0] + 1, boardIndex[1]}, board, trace, findResult);
                    trace[boardIndex[0] + 1][boardIndex[1]] = 0;
                }
            }
            if (boardIndex[1] + 1 < board[0].length) {
                if (trace[boardIndex[0]][boardIndex[1] + 1] != 1
                        && board[boardIndex[0]][boardIndex[1] + 1] == soloChar) {
                    trace[boardIndex[0]][boardIndex[1] + 1] = 1;
                    findWord(soloCharMap, new int[]{boardIndex[0], boardIndex[1] + 1}, board, trace, findResult);
                    trace[boardIndex[0]][boardIndex[1] + 1] = 0;
                }
            }
        }
    }
}
