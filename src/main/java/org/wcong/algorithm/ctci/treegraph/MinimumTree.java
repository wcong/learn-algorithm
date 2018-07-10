package org.wcong.algorithm.ctci.treegraph;

/**
 * give sorted a array of integer with unique numbers
 * write a method to create a minimum binary tree
 *
 * @author wcong<wc19920415@gmail.com>
 * @since 12/12/2017
 */
public class MinimumTree {


    public TreeNode minimumTree(int[] array) {
        return rootNode(array, 0, array.length - 1);
    }

    private TreeNode rootNode(int[] array, int start, int end) {
        if (start < end) {
            return null;
        } else if (start == end) {
            TreeNode node = new TreeNode();
            node.x = array[start];
            return node;
        } else {
            int middle = (end + start) / 2;
            TreeNode node = new TreeNode();
            node.x = array[middle];
            node.left = rootNode(array, start, middle - 1);
            node.right = rootNode(array, middle + 1, end);
            return node;
        }
    }
}
