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
        if (status.found) {
            if (status.node == null) {
                status.node = node;
            }
        } else {
            if (status.target < node.x) {
                successor(node.left, status);
                if (status.found && status.node == null) {
                    status.node = node;
                }
            } else if (status.target == node.x) {
                status.found = true;
                successor(node.right, status);
            } else {
                successor(node.right, status);
            }
        }
    }

}
