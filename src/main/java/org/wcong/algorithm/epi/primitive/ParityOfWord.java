package org.wcong.algorithm.epi.primitive;

/**
 * The parity of a binary word is 1 if the number of Is in the word is odd;otherwise, it is 0.
 * For example, the parity of 1011 is 1, and the parity of 10001000 is 0.
 * Parity checks are used to detect single bit errors in data storage and communication
 * 1 brute force O(n)
 * 2 greed O(k)
 * 3 cache and greed O(1)
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 26/02/2018
 */
public class ParityOfWord {

    public boolean parityOfWord(long word) {
        int numberOf1 = 0;
        while (word != 0) {
            numberOf1 += (word & 1);
            word >>>= word;
        }
        return (numberOf1 & 1) == 1;
    }

}
