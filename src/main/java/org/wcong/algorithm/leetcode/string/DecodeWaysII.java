package org.wcong.algorithm.leetcode.string;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping way:
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Beyond that, now the encoded string can also contain the character '*',
 * which can be treated as one of the numbers from 1 to 9.
 * Given the encoded message containing digits and the character '*',
 * return the total number of ways to decode it.
 * Also, since the answer may be very large, you should return the output mod 10^9 + 7.
 * Example 1:
 * Input: "*"
 * Output: 9
 * Explanation: The encoded message can be decoded to the string: "A", "B", "C", "D", "E", "F", "G", "H", "I".
 * Example 2:
 * Input: "1*"
 * Output: 9 + 9 = 18
 * Note:
 * The length of the input string will fit in range [1, 105].
 * The input string will only contain the character '*' and digits '0' - '9'.
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 21/08/2017
 */
public class DecodeWaysII {

    public int numDecodings(String s) {
        long[] decodingWays = new long[s.length() + 1];
        char[] charArray = s.toCharArray();
        if (charArray[0] == '0') {
            return 0;
        }
        decodingWays[0] = 1;
        decodingWays[1] = charArray[0] == '*' ? 9 : 1;
        for (int i = 1; i < charArray.length; i++) {
            long encodingWay = 0;
            if (charArray[i] == '*') {
                encodingWay += 9 * decodingWays[i];
                if (charArray[i - 1] == '*') {
                    encodingWay += 15 * decodingWays[i - 1];
                } else {
                    if (charArray[i - 1] == '1') {
                        encodingWay += 9 * decodingWays[i - 1];
                    } else if (charArray[i - 1] == '2') {
                        encodingWay += 6 * decodingWays[i - 1];
                    }
                }
            } else if (charArray[i] == '0') {
                if (charArray[i - 1] == '*') {
                    encodingWay += 2 * decodingWays[i - 1];
                } else if (charArray[i - 1] == '0' || charArray[i-1] > '2') {
                    return 0;
                } else {
                    encodingWay += decodingWays[i - 1];
                }
            } else {
                encodingWay += decodingWays[i];
                if (charArray[i - 1] == '*') {
                    if (charArray[i] < '7') {
                        encodingWay += 2 * decodingWays[i - 1];
                    } else {
                        encodingWay += decodingWays[i - 1];
                    }
                } else if (charArray[i - 1] == '1') {
                    encodingWay += decodingWays[i - 1];
                } else if (charArray[i - 1] == '2' && charArray[i] < '7') {
                    encodingWay += decodingWays[i - 1];
                }
            }
            encodingWay = encodingWay% 1000000007;
            decodingWays[i + 1] = encodingWay;
        }
        return (int)decodingWays[s.length()];
    }
}
