package leetcode.easy.minimum_depth_of_binary_tree;

import java.util.LinkedList;

public class Solution {

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    var queue = new LinkedList<TreeNode>();
    queue.add(root);
    int depth = 0;
    while (!queue.isEmpty()) {
      depth++;
      var size = queue.size();
      for (int i = 0; i < size; i++) {
        var node = queue.pop();
        if (node.left == null && node.right == null) {
          return depth;
        }
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
    }
    return depth;
  }

  public int minDepthRec(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null) {
      return minDepthRec(root.right) + 1;
    }
    if (root.right == null) {
      return minDepthRec(root.left) + 1;
    }
    return Math.min(minDepthRec(root.left), minDepthRec(root.right)) + 1;
  }

}
