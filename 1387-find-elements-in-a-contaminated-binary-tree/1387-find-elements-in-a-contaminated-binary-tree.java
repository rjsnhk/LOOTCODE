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
class FindElements {
    HashSet<Integer> hs=new HashSet<>();
    public void buildTree(TreeNode root,int val){
        if(root==null) return;
        root.val=val;
        hs.add(val);
        buildTree(root.left,2*val+1);
        buildTree(root.right,2*val+2);

    }
    public FindElements(TreeNode root) {
        buildTree(root,0);
    }
    
    public boolean find(int target) {
        return hs.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */