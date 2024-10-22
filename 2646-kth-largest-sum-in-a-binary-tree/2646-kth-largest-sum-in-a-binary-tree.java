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
    public long kthLargestLevelSum(TreeNode root, int k) {

        Queue<TreeNode> q=new LinkedList<>();
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());

        q.add(root);
        q.add(null);
        long sum=0;
        while(!q.isEmpty()){
            TreeNode pp=q.remove();
            if(pp==null){
                if(q.isEmpty()){ 
                    pq.add(sum);
                    break;}
                else{
                    pq.add(sum);
                    sum=0;
                    q.add(null);
                }
            }else{
                    sum+=pp.val;
                    if(pp.left!=null) q.add(pp.left);
                    if(pp.right!=null) q.add(pp.right);
            }
        }
long ans=0;
        for(int i=1;i<=k;i++){
            if(pq.isEmpty()) return -1;
            ans=pq.remove();
            

        }
        return ans;
        
    }
}