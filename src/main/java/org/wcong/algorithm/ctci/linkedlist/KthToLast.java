package org.wcong.algorithm.ctci.linkedlist;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/6/5
 */
public class KthToLast {


    public Node kthLast(Node root, int k) {
        Node currentNode = root;
        int length = 1;
        while (currentNode.next != null && length < k) {
            currentNode = currentNode.next;
            length += 1;
        }
        if (length <= k) {
            return root;
        }
        Node kthLast = root;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            kthLast = kthLast.next;
        }
        return kthLast;
    }
}
