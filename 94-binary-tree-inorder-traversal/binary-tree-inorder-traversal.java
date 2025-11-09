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
      
      List<Integer> result = new ArrayList<>();  //create the empty list store the answer
      
      traverse(root,result);   //call method...
      return result;
    } 



    private void traverse(TreeNode node,List<Integer> result)
    {
        if(node==null)      //if node empty code stops here...
        {
            return;
        }

        traverse(node.left,result);
        result.add(node.val);
        traverse(node.right,result);
    }


}