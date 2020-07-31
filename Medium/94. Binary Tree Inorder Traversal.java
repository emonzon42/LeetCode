/*
Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
 */

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> returnVals = new LinkedList<>();
        
        if (nodeExists(root)){
            
            if (nodeExists(root.left))
                returnVals.addAll(inorderTraversal(root.left));
            
            returnVals.add(root.val);
            
            if (nodeExists(root.right))
                returnVals.addAll(inorderTraversal(root.right));
            
            return returnVals;
        }
        else
            return Collections.emptyList();

    }
    
    public boolean nodeExists(TreeNode node){
        return (node != null);
    }
}