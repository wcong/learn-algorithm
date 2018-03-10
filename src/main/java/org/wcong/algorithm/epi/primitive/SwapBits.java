package org.wcong.algorithm.epi.primitive;

/**
 * Implement code that takes as input a 64-bit integer and swaps the bits at indices i and y.
 * <p>
 * 1 brute force O(1)
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 27/02/2018
 */
public class SwapBits {

    public long swapBit(long number, int i, int j) {
        i -= 1;
        j -= 1;
        if (((number >> i) & 1) != ((number >> j) & 1)) {
            int bitMasks = (1 << j) | (1 << i);
            number ^= bitMasks;
        }
        return number;
    }

}
