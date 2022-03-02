/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一棵树的子树
 */

// @lc code=start
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root,subRoot);
    }
    public boolean dfs(TreeNode root, TreeNode subRoot) {
        if(root==null) {
            return false;
        }
        return check(root,subRoot) || dfs(root.left,subRoot)||dfs(root.right,subRoot); 
    }
    public boolean check(TreeNode p, TreeNode q){
        if(p==null &&q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return q.val==p.val && check(p.left,q.left) &&check(p.right,q.right);
    }
}
// @lc code=end

