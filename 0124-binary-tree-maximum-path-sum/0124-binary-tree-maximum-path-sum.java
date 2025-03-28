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
    int res;
    int solve(TreeNode root){
        if(root==null) return 0;
        int l=solve(root.left);
        int r=solve(root.right);
        int temp=Math.max(Math.max(l,r)+root.val,root.val); //agar nhi lena
        int ans=Math.max(temp,l+r+root.val);
        res=Math.max(ans,res);
        return temp;

    }
    public int maxPathSum(TreeNode root) {
        res=Integer.MIN_VALUE;
        solve(root);
        return res;
    }
}