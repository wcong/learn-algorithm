package org.wcong.algorithm.jzoffer.linked_list;


import org.wcong.algorithm.jzoffer.util.BuildLinkedList;
import org.wcong.algorithm.jzoffer.util.LinkedList;
import org.wcong.algorithm.jzoffer.util.LinkedListNode;

/**
 * test for linked list and exceptions and continue thinking and two pointers
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 2017/3/26
 */
public class LastKNodeInLinkedList {

    public static void main(String[] args) {
        LinkedList one = BuildLinkedList.makeOne(new int[]{1, 2, 3, 4, 5});
        assert (lastKNode(one, 6) == null);
        assert (lastKNode(one, 3).value == 3);
    }

    public static LinkedListNode lastKNode(LinkedList linkedList, int k) {
        if (linkedList == null || linkedList.root == null || k < 1) {
            return null;
        }
        LinkedListNode lastKNode = linkedList.root;
        int count = 1;
        LinkedListNode node = linkedList.root;
        while (node.next != null) {
            count += 1;
            node = node.next;
            if (count > k) {
                lastKNode = lastKNode.next;
            }
        }
        return count < k ? null : lastKNode;
    }

}
