package leetcode.easy.binary_tree_preorder_traversal;

import java.util.LinkedList;
import java.util.List;

public class Solution {

  public List<Integer> preorderTraversal(TreeNode root) {
    var result = new LinkedList<Integer>();
    if (root == null) {
      return result;
    }

    var stack = new LinkedList<TreeNode>();
    stack.add(root);

    while (!stack.isEmpty()) {
      var node = stack.pop();
      result.add(node.val);
      if (node.right != null) {
        stack.push(node.right);
      }
      if (node.left != null) {
        stack.push(node.left);
      }
    }

    return result;
  }

}
