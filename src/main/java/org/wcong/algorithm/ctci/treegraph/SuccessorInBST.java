package org.wcong.algorithm.ctci.treegraph;

/**
 * @author wcong<wc19920415@gmail.com>
 * @since 12/12/2017
 */
public class SuccessorInBST {

    static class Status {
        int target;
        boolean found = false;
        TreeNode node;
    }

    public int successor(TreeNode node, int target) {
        Status status = new Status();
        status.target = target;
        successor(node, status);
        return status.node != null ? status.node.x : 0;
    }

    private void successor(TreeNode node, Status status) {
        if (node.left != null) {
            successor(node.left, status);
        }
        if (status.found) {
            if (status.node == null) {
                status.node = node;
            }
            return;
        }
        if (node.x == status.target) {
            status.found = true;
        }
        if (node.right != null) {
            successor(node.right, status);
        }
    }

}
