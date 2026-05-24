/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        return getBalanceStatusAndHeight(root)[0] == 1;
    }

    private int[] getBalanceStatusAndHeight(TreeNode node) {
        if (node == null) {
            return new int[] {1, 0};
        }

        int[] left = getBalanceStatusAndHeight(node.left);
        int[] right = getBalanceStatusAndHeight(node.right);

        boolean isBalanced = (left[0] + right[0] == 2) && (Math.abs(left[1] - right[1]) <= 1);

        int height = 1 + Math.max(left[1], right[1]);

        return new int[] {isBalanced ? 1 : 0, height};
    }
}
