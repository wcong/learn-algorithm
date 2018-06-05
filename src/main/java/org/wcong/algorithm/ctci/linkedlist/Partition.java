package org.wcong.algorithm.ctci.linkedlist;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 2018/6/5
 */
public class Partition {

    public static class Linked {
        Node root;
        Node tail;
    }

    public Node partition(Node node, int value) {
        Linked[] nodeList = new Linked[3];
        while (node != null) {
            int index = node.value < value ? 0 : node.value == value ? 1 : 2;
            Linked partition = nodeList[index];
            if (partition == null) {
                partition = new Linked();
                nodeList[index] = partition;
                partition.root = node;
                partition.tail = node;
            } else {
                partition.tail.next = node;
                partition.tail = node;
            }
            node = node.next;
        }
        Linked last = null;
        Node root = null;
        for (int i = 0; i < nodeList.length; i++) {
            if (nodeList[i] == null) {
                continue;
            }
            if (last == null) {
                last = nodeList[i];
                root = last.root;
            } else {
                last.tail.next = nodeList[i].root;
                last = nodeList[i];
            }
        }
        return root;
    }

}
