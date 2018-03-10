package org.wcong.algorithm.epi.primitive;

/**
 * Implement code that takes as input a 64-bit integer and swaps the bits at indices i and y.
 *
 * 1 brute force O(1)
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 27/02/2018
 */
public class SwapBits {

    public long swapBit(long number, int i, int j) {
        if (i < j) {
            int temp = i;
            i = j;
            j = temp;
        }
        long first = number & (1 << i);
        long second = number & (1 << j);
        first = first >> (i - j);
        second = second << (i - j);
        return number & ~(1 << i) & second & ~(1 << j) & first;
    }

}
