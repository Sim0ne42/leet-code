package leetcode.symmetrictree;

import java.util.LinkedList;

public class Solution {

  public boolean isSymmetric(TreeNode root) {
    if (root == null || root.left == null && root.right == null) {
      return true;
    }

    if (root.left == null || root.right == null) {
      return false;
    }

    return areSymmetric(root.left, root.right);
  }

  private boolean areSymmetric(TreeNode leftTree, TreeNode rightTree) {
    var leftStack = new LinkedList<TreeNode>();
    leftStack.push(leftTree);
    var rightStack = new LinkedList<TreeNode>();
    rightStack.push(rightTree);

    while (!leftStack.isEmpty() && !rightStack.isEmpty()) {
      var leftNode = leftStack.pop();
      var rightNode = rightStack.pop();

      if (leftNode.val != rightNode.val
          || (leftNode.left != null && rightNode.right == null)
          || (leftNode.right != null && rightNode.left == null)) {
        return false;
      }

      var lln = leftNode.left;
      if (lln != null) {
        leftStack.push(lln);
      }
      var lrn = leftNode.right;
      if (lrn != null) {
        leftStack.push(lrn);
      }
      var rrn = rightNode.right;
      if (rrn != null) {
        rightStack.push(rrn);
      }
      var rln = rightNode.left;
      if (rln != null) {
        rightStack.push(rln);
      }
    }

    return leftStack.isEmpty() && rightStack.isEmpty();
  }

}
