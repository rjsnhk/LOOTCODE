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
    public int rob(TreeNode root) {
        if(hm.containsKey(root)) return hm.get(root);
        if(root==null) return 0;
        int leftleftGC=0;
        int leftrightGC=0;

        int rightleftGC=0;
        int rightrightGC=0;

        if(root.left!=null){
            leftleftGC=rob(root.left.left);
            leftrightGC=rob(root.left.right);
        }
        if(root.right!=null){
            rightleftGC=rob(root.right.left);
            rightrightGC=rob(root.right.right);
        }

        int include=root.val+leftleftGC+leftrightGC+rightleftGC+rightrightGC;
        int exclude=rob(root.left)+rob(root.right);

        hm.put(root,Math.max(include,exclude));
        return hm.get(root);
    }
}