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
    int maxD=0;
    int sum=0;
    public void depth(TreeNode root,int d){
        if(root==null) return;
        hm.put(root,d);
        maxD=Math.max(d,maxD);
        depth(root.left,d+1);
        depth(root.right,d+1);
    }
    void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        if(hm.get(root)==maxD) sum+=root.val;
        inOrder(root.right);
    }
    public int deepestLeavesSum(TreeNode root) {
        depth(root,0);
        inOrder(root);
        return sum;
    }
}