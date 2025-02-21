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
    TreeNode root;
    public FindElements(TreeNode root) {
        this.root=root;
        Queue<TreeNode> q=new LinkedList<>();
        root.val=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                if(q.isEmpty()) break;
                else q.add(null);
            }
                else{
                    if(curr.left!=null) {q.add(curr.left);
                    curr.left.val=2*curr.val+1;
                    };
                    if(curr.right!=null) {q.add(curr.right);
                    curr.right.val=2*curr.val+2;
                    }
                }
            }

        }
    
    
    public boolean find(int target) {
        Queue<TreeNode> q=new LinkedList<>();
        root.val=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                if(q.isEmpty()) break;
                else q.add(null);
            }
                else{
                    if(curr.val==target) return true;
                    if(curr.left!=null) {q.add(curr.left);
                    };
                    if(curr.right!=null) {q.add(curr.right);
                    }
                }
            }
            return false;
        
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */