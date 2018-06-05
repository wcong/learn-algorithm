package org.wcong.algorithm.ctci.array;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/6/4
 */
public class CheckPermutation {

    public boolean isPermutation(String a, String b) {
        int[] charCountA = new int[26];
        for (char soloChar : a.toCharArray()) {
            charCountA[soloChar - 'a'] += 1;
        }
        int[] chatCountB = new int[26];
        for (char soloChar : b.toCharArray()) {
            chatCountB[soloChar - 'a'] += 1;
        }
        for (int i = 0; i < charCountA.length; i++) {
            if (charCountA[i] != chatCountB[i]) {
                return false;
            }
        }
        return true;
    }

}
