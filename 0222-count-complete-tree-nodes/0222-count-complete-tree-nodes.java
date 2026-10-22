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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);
        if(leftHeight == rightHeight){
            return (int)(Math.pow(2,leftHeight) - 1);
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }

    private int getLeftHeight(TreeNode nodes){
        int height = 0;
        while(nodes != null){
            height++;
            nodes = nodes.left;
        }
        return height;
    }

    private int getRightHeight(TreeNode nodes){
        int height = 0;
        while(nodes != null){
            height++;
            nodes = nodes.right;
        }
        return height;
    }
}