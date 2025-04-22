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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if (root==null) return ans;
         int c=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        ans.add(new ArrayList<>());
        
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                
                
                    if(c%2!=0) {
                        ans.set(c,reverse(ans.get(c)));
                    }
                    if(q.isEmpty()) break;
                    else {
                    q.add(null);
                    c++;
                    ans.add(new ArrayList<>());
                }
            }else{
                ans.get(c).add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return ans;
    }
    public List<Integer> reverse(List<Integer> ar){
        int i=0;
        int j=ar.size()-1;
        while(i<j){
            int tem=ar.get(i);
            ar.set(i,ar.get(j));
            ar.set(j,tem);
            i++;
            j--;
        }
        return ar;
    }
}
