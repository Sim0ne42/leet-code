package leetcode.symmetrictree;

public class SolutionRec {

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }

    return areSymmetric(root.left, root.right);
  }

  private boolean areSymmetric(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) {
      return true;
    }
    if (node1 == null || node2 == null) {
      return false;
    }

    return node1.val == node2.val
        && areSymmetric(node1.right, node2.left)
        && areSymmetric(node1.left, node2.right);
  }

}
