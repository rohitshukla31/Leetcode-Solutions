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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDiam = diameterOfBinaryTree(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameterOfBinaryTree(root.right);
        int rightHt = height(root.right);
        int selfDiam = leftHt + rightHt  + 2;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

    }

    private int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh) + 1;
    }
}