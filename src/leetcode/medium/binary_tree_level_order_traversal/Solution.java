package leetcode.medium.binary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

  public List<List<Integer>> levelOrder(TreeNode root) {
    var queue = new LinkedList<TreeNode>();
    var result = new ArrayList<List<Integer>>();

    if (root == null) {
      return result;
    }

    queue.add(root);
    while (!queue.isEmpty()) {
      var level = new ArrayList<Integer>();
      var nodes = new ArrayList<>(queue);
      queue.clear();

      for (TreeNode node : nodes) {
        level.add(node.val);
        var leftNode = node.left;
        if (leftNode != null) {
          queue.addLast(leftNode);
        }
        var rightNode = node.right;
        if (rightNode != null) {
          queue.addLast(rightNode);
        }
      }

      result.add(level);
    }

    return result;
  }

}
