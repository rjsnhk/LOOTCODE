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
    TreeNode prev=null;
    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode dummy=new TreeNode();
        prev=dummy;
        preorder(root);
        root.left=null;
        root.right=dummy.right.right;
    }
    void preorder(TreeNode root){
        if(root==null) return;
        TreeNode newNode=new TreeNode(root.val);
        prev.right=newNode;
        prev=newNode;
        preorder(root.left);
        preorder(root.right);
    }
}