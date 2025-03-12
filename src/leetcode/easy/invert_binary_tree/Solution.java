package leetcode.easy.invert_binary_tree;

import java.util.LinkedList;

public class Solution {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    var queue = new LinkedList<TreeNode>();
    queue.add(root);

    while (!queue.isEmpty()) {
      var node = queue.poll();
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
      var temp = node.left;
      node.left = node.right;
      node.right = temp;
    }

    return root;
  }

  public TreeNode invertTreeRec(TreeNode root) {
    if (root == null) {
      return null;
    }

    var temp = root.left;
    root.left = root.right;
    root.right = temp;
    invertTreeRec(root.left);
    invertTreeRec(root.right);
    return root;
  }

}
