package org.wcong.algorithm.ctci.hard;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

/**
 * given an array filled with letters and numbers
 * find the longest sub array with an equal number of letters and numbers
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 01/12/2017
 */
public class LetterAndNumbers {

    @Data
    @AllArgsConstructor
    static class Index {
        private int index;
        private int letterNum;
        private int numberNum;

    }

    // tips sequence sub array
    // memory

    public int[] longest(char[] array) {
        Map<Integer, List<Index>> distanceMap = new HashMap<>();
        Index firstIndex = new Index(0, 0, 0);
        if (isNumber(array[0])) {
            firstIndex.numberNum += 1;
        } else {
            firstIndex.letterNum += 1;
        }
        if (isNumber(array[1])) {
            firstIndex.numberNum += 1;
        } else {
            firstIndex.letterNum += 1;
        }

        int currentNumber = firstIndex.numberNum;
        int currentLetter = firstIndex.letterNum;
        int[] longest = new int[2];
        distanceMap.put(firstIndex.numberNum - firstIndex.letterNum, new ArrayList<>(Collections.singleton(firstIndex)));
        if (firstIndex.letterNum == firstIndex.numberNum) {
            longest[0] = 0;
            longest[1] = 1;
        }
        for (int i = 2; i < array.length; i++) {
            if (isNumber(array[i])) {
                currentNumber += 1;
            } else {
                currentLetter += 1;
            }
            int different = currentNumber - currentLetter;
            if (different == 0) {
                longest[0] = 0;
                longest[1] = i;
            } else {
                List<Index> indexList = distanceMap.get(different);
                if (indexList != null) {
                    Index index = indexList.get(0);
                    if (i - index.index > longest[1] - longest[0]) {
                        longest[0] = index.index;
                        longest[1] = i;
                    }
                } else {
                    indexList = new ArrayList<>();
                    distanceMap.put(different, indexList);
                }
                indexList.add(new Index(i, currentLetter, currentNumber));
            }
        }
        return longest;
    }

    private boolean isNumber(char soloChar) {
        int actualNum = (int) soloChar;
        return actualNum >= 48 && actualNum <= 57;
    }

}
