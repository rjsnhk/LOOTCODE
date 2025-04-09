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
    HashMap<TreeNode,Integer> hm=new HashMap<>();
    int max=0;
    public void maxD(TreeNode root,int d){
        if(root==null) return;
        hm.put(root,d);
        max=Math.max(max,d);
        maxD(root.left,d+1);
        maxD(root.right,d+1);
    }
    public TreeNode lca(TreeNode root){
        if(root==null||hm.get(root)==max) return root;
        TreeNode l=lca(root.left);
        TreeNode r=lca(root.right);
        if(l!=null&&r!=null) return root;
        else if(r!=null) return r;
        else return l;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
            maxD(root,0);
            return lca(root);
    }
}