package leetcode.easy.maximum_depth_of_binary_tree;

import java.util.LinkedList;

public class Solution {

  public int maxDepthRec(TreeNode root) {
    if (root == null) {
      return 0;
    }

    return Math.max(maxDepthRec(root.left), maxDepthRec(root.right)) + 1;
  }

  public int maxDepthBfs(TreeNode root) {
    int height = 0;
    if (root == null) {
      return height;
    }

    LinkedList<TreeNode> queue = new LinkedList<>();
    queue.addLast(root);

    while (!queue.isEmpty()) {
      for (int i = 0; i < queue.size(); i++) {
        TreeNode node = queue.pop();
        if (node.left != null) {
          queue.addLast(node.left);
        }
        if (node.right != null) {
          queue.addLast(node.right);
        }
      }
      height++;
    }

    return height;
  }

  public int maxDepthDfs(TreeNode root) {
    if (root == null) {
      return 0;
    }

    LinkedList<TreeNode> nodeStack = new LinkedList<>();
    LinkedList<Integer> heightStack = new LinkedList<>();

    nodeStack.push(root);
    heightStack.push(1);

    int maxHeight = 0;
    while (!nodeStack.isEmpty() && !heightStack.isEmpty()) {
      TreeNode node = nodeStack.pop();
      int height = heightStack.pop();
      maxHeight = Math.max(height, maxHeight);
      if (node.right != null) {
        nodeStack.push(node.right);
        heightStack.push(height + 1);
      }
      if (node.left != null) {
        nodeStack.push(node.left);
        heightStack.push(height + 1);
      }
    }

    return maxHeight;
  }

}
