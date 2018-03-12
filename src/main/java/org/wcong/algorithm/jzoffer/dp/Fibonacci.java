package org.wcong.algorithm.jzoffer.dp;

/**
 * test for recursive and numbers
 * Created by wcong on 2017/3/24.
 */
public class Fibonacci {

    public static void main(String[] args) {
        assert (fibonacci(2) == 2);
        assert (fibonacci(4) == 5);
        assert (fibonacci(6) == 13);
    }

    static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        int last = 1;
        int lastOfLast = 1;
        for (int i = 2; i < n; i++) {
            int now = last + lastOfLast;
            lastOfLast = last;
            last = now;
        }
        return last + lastOfLast;
    }
}
