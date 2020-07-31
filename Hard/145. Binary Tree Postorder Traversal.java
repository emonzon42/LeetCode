/*
 Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> returnVals = new LinkedList<>();
        
        if (nodeExists(root)){
            
            if (nodeExists(root.left))
                returnVals.addAll(postorderTraversal(root.left));
            
            if (nodeExists(root.right))
                returnVals.addAll(postorderTraversal(root.right));
            
            returnVals.add(root.val);

            return returnVals;
        }
        else
            return Collections.emptyList();

    }
    
    public boolean nodeExists(TreeNode node){
        return (node != null);
    }
}