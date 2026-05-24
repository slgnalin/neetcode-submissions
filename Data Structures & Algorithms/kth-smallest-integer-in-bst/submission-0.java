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
    int count;
    int target;
    int res;

    public int kthSmallest(TreeNode root, int k) {
        target = k;
        print(root);
        return res;
    }

    private void print(TreeNode node) {
        if (node == null) {
            return;
        }

        print(node.left);
        System.out.println(node.val);
        int current = node.val;
        count++;
        if (count == target) {
            res = current;
            System.out.println("^^^^");
        }
        print(node.right);

        return;
    }
}
