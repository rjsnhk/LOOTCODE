class Solution {

    static final int[] heights = new int[100001];
    int maxHeight = 0;

    public int[] treeQueries(TreeNode root, int[] queries) {
        getLeftHeights(root, 0);
        maxHeight = 0;
        getRightHeights(root, 0);

        int n = queries.length;
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = heights[queries[i]];
        }

        return result;
    }

    private void getLeftHeights(TreeNode node, int height) {
        heights[node.val] = maxHeight;
        maxHeight = Math.max(maxHeight, height);
        if (node.left != null) getLeftHeights(node.left, height + 1);
        if (node.right != null) getLeftHeights(node.right, height + 1);
    }

    private void getRightHeights(TreeNode node, int height) {
        heights[node.val] = Math.max(heights[node.val], maxHeight);
        maxHeight = Math.max(height, maxHeight);
        if (node.right != null) getRightHeights(node.right, height + 1);
        if (node.left != null) getRightHeights(node.left, height + 1);
    }
}