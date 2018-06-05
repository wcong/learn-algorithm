package org.wcong.algorithm.ctci.array;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/6/4
 */
public class EditDistance {

    public int editDistance(String a, String b) {
        int[][] distance = new int[a.length() + 1][b.length() + 1];
        distance[0][0] = 0;
        for (int i = 0; i < a.length(); i++) {
            distance[i + 1][0] = i + 1;
        }
        for (int i = 0; i < b.length(); i++) {
            distance[0][i + 1] = i + 1;
        }
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    distance[i + 1][j + 1] = distance[i][j];
                } else {
                    int min = distance[i][j];
                    min = min > distance[i + 1][j] ? distance[i + 1][j] : min;
                    min = min > distance[i][j + 1] ? distance[i][j + 1] : min;
                    distance[i + 1][j + 1] = min;
                }
            }
        }
        return distance[a.length()][b.length()];
    }

}
