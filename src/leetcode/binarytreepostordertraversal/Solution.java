package leetcode.binarytreepostordertraversal;

import java.util.LinkedList;
import java.util.List;

public class Solution {

  public List<Integer> postorderTraversal(TreeNode root) {
    var result = new LinkedList<Integer>();
    if (root == null) {
      return result;
    }

    var stack = new LinkedList<TreeNode>();
    stack.add(root);

    while (!stack.isEmpty()) {
      var node = stack.pop();
      result.addFirst(node.val);
      if (node.left != null) {
        stack.push(node.left);
      }
      if (node.right != null) {
        stack.push(node.right);
      }
    }

    return result;
  }

}
