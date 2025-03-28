class Solution {
    int res;

    int solve(TreeNode root) {
        if (root == null) return 0;

        int l = solve(root.left);
        int r = solve(root.right);

        int temp = Math.max(l, r) + 1;
        int ans = Math.max(temp, l + r + 1);
        
        res = Math.max(ans, res);  // Modify the class-level `res`

        return temp;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        res = Integer.MIN_VALUE;
        solve(root);
        return res - 1; // Diameter is edges (nodes - 1)
    }
}
