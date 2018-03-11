package org.wcong.algorithm.epi.array.onedimension;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Write a program that takes two arrays representing integers,
 * and returns an integer representing their product
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 11/03/2018
 */
public class MultiplyArbitraryInteger {

    public int[] multiply(int[] number1, int[] number2) {
        return number1;
    }

    public void multiply(LinkedList<Integer> number, int multiply) {
    }

    private LinkedList<Integer> add(LinkedList<Integer> number1, LinkedList<Integer> number2) {
        LinkedList<Integer> result = new LinkedList<>();
        int number = 0;
        Iterator<Integer> iterator1 = number1.iterator();
        Iterator<Integer> iterator2 = number2.iterator();
        while (iterator1.hasNext() || iterator2.hasNext()) {
            number += iterator1.hasNext() ? iterator1.next() : 0;
            number += iterator2.hasNext() ? iterator2.next() : 0;
            if (number > 10) {
                result.add(number % 10);
                number = number / 10;
            } else {
                result.add(number);
                number = 0;
            }
        }
        if (number > 0) {
            result.add(number);
        }
        return result;
    }

}
