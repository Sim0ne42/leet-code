package leetcode.balancedbinarytree;

public class Main {

  public static void main(String[] args) {
    var root1 = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    System.out.println(new Solution().isBalanced(root1));

    var root = new TreeNode(1,
        new TreeNode(2,
            new TreeNode(3, new TreeNode(4), new TreeNode(4)),
            new TreeNode(3)),
        new TreeNode(2));
    System.out.println(new Solution().isBalanced(root));
  }

}
