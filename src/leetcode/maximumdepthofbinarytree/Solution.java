package leetcode.maximumdepthofbinarytree;

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

    var queue = new LinkedList<TreeNode>();
    queue.addLast(root);

    while (!queue.isEmpty()) {
      for (int i = 0; i < queue.size(); i++) {
        var node = queue.pop();
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

    var nodeStack = new LinkedList<TreeNode>();
    var heightStack = new LinkedList<Integer>();

    nodeStack.push(root);
    heightStack.push(1);

    while (!nodeStack.isEmpty()) {
      var node = nodeStack.pop();
      var height = heightStack.getFirst();
      if (node.left != null) {
        nodeStack.push(node.left);
        heightStack.push(height + 1);
      }
      if (node.right != null) {
        nodeStack.push(node.right);
        heightStack.push(height + 1);
      }
    }

    return heightStack.getFirst();
  }

}
