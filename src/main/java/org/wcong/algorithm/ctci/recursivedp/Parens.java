package org.wcong.algorithm.ctci.recursivedp;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/7/10
 */
public class Parens {

    public void parens(int n) {
        char[] result = new char[n * 2];
        parens(result, n, n, 0);
    }

    private void parens(char[] result, int left, int right, int index) {
        if (left < 0 || left < right) {
            return;
        }
        if (left == 0 && right == 0) {
            System.out.println(result);
        } else {
            result[index] = '(';
            parens(result, left - 1, right, index + 1);
            result[index] = ')';
            parens(result, left, right - 1, index + 1);
        }
    }

}
