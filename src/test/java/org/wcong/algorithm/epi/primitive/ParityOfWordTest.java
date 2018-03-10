package org.wcong.algorithm.epi.primitive;

import org.junit.Test;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 10/03/2018
 */
public class ParityOfWordTest {

    @Test
    public void testParity() {
        ParityOfWord parityOfWord = new ParityOfWord();
        assert !parityOfWord.parityOfWord(0b11111101);
        assert parityOfWord.parityOfWord(0b1111110);
        assert parityOfWord.parityOfWord(0b111111011);
    }

}
