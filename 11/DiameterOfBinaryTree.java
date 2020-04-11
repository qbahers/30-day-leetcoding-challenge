/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class DiameterOfBinaryTree {

    int res;
    
    public int diameterOfBinaryTree(TreeNode root) {
        res = 0;
        
        depth(root);
        
        return res;
    }
    
    private int depth(TreeNode root) {
        if (root == null)
            return -1;
        
        int l = depth(root.left);
        int r = depth(root.right);
        
        res = Math.max(res, 2 + l + r);
        
        return 1 + Math.max(l, r);
    }
    
}
