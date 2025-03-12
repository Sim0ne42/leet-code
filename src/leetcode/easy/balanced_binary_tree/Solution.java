package leetcode.easy.balanced_binary_tree;

public class Solution {

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    return Math.abs((getMaxDepth(root.left) - getMaxDepth(root.right))) <= 1
        && isBalanced(root.left) && isBalanced(root.right);
  }

  private int getMaxDepth(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return Math.max(getMaxDepth(node.left), getMaxDepth(node.right)) + 1;
  }

}
