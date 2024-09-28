package leetcode.binarytreeinordertraversal;

import java.util.LinkedList;
import java.util.List;

public class Solution {

  public List<Integer> inorderTraversal(TreeNode root) {
    var result = new LinkedList<Integer>();
    var stack = new LinkedList<TreeNode>();
    var node = root;

    while (node != null || !stack.isEmpty()) {
      while (node != null) {
        stack.push(node);
        node = node.left;
      }
      node = stack.pop();
      result.add(node.val);
      node = node.right;
    }

    return result;
  }

  public List<Integer> inorderTraversalRec(TreeNode root) {
    var result = new LinkedList<Integer>();
    if (root == null) {
      return result;
    }

    dfs(result, root);
    return result;
  }

  private void dfs(List<Integer> result, TreeNode root) {
    if (root == null) {
      return;
    }

    dfs(result, root.left);
    result.add(root.val);
    dfs(result, root.right);
  }

}

