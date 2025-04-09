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
    TreeNode lca(TreeNode r){
        if(r==null||hm.get(r)==max) return r;
        TreeNode l=lca(r.left);
        TreeNode right=lca(r.right);
        if(l!=null&&right!=null) return r;
        else if(l!=null) return l;
        else return right;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        maxD(root,0);
        return lca(root);

    }
}