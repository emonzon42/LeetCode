/*
 Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> returnVals = new LinkedList<>();
        
        if (nodeExists(root))
            returnVals.add(root.val);
        else
            return Collections.emptyList();
        
        if (nodeExists(root.left))
            returnVals.addAll(preorderTraversal(root.left));
        if (nodeExists(root.right))
            returnVals.addAll(preorderTraversal(root.right));
        
        return returnVals;
    }
    
    public boolean nodeExists(TreeNode node){
        return (node != null);
    }

}