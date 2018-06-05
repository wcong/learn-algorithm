package org.wcong.algorithm.ctci.array;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/6/4
 */
public class StringCompression {

    public String stringCompression(String a) {
        if (a == null || a.length() == 0) {
            return a;
        }
        int newLength = 0;
        int current = a.charAt(0);
        int count = 1;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == current) {
                count += 1;
            } else {
                newLength += count;
                current = a.charAt(i);
                count = 1;
            }
        }
        newLength += count;
        if (newLength > a.length()) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder(newLength);
        current = a.charAt(0);
        count = 1;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == current) {
                count += 1;
            } else {
                stringBuilder.append(current).append(count);
                current = a.charAt(i);
                count = 1;
            }
        }
        stringBuilder.append(current).append(count);
        return stringBuilder.toString();
    }

}
