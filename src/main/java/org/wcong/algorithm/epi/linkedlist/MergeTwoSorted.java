package org.wcong.algorithm.epi.linkedlist;

import org.wcong.algorithm.basic.LinkedNode;

/**
 * Write a program that takes two lists, assumed to be sorted, and returns their merge.
 * The only field your program can change in a node is its next field
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 11/03/2018
 */
public class MergeTwoSorted {

    public LinkedNode merge(LinkedNode first, LinkedNode second) {
        LinkedNode mergeFirst = null;
        if (first.value < second.value) {
            mergeFirst = first;
            first = first.next;
        } else {
            mergeFirst = second;
            second = second.next;
        }
        LinkedNode current = mergeFirst;
        while (first != null || second != null) {
            if (first == null) {
                current.next = second;
                second = second.next;
            } else if (second == null) {
                current.next = first;
                first = first.next;
            } else {
                if (first.value < second.value) {
                    current.next = first;
                    first = first.next;
                } else {
                    current.next = second;
                    second = second.next;
                }
            }
        }
        return mergeFirst;
    }

}
