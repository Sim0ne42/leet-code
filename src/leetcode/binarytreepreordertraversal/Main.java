package leetcode.binarytreepreordertraversal;

public class Main {

  public static void main(String[] args) {
    var root1 = new TreeNode(1,
        null,
        new TreeNode(2, new TreeNode(3), null));
    System.out.println(new Solution().preorderTraversal(root1));

    var root2 = new TreeNode(1,
        new TreeNode(2,
            new TreeNode(4),
            new TreeNode(5, new TreeNode(6), new TreeNode(7))),
        new TreeNode(3,
            null,
            new TreeNode(8, new TreeNode(9), null))
    );
    System.out.println(new Solution().preorderTraversal(root2));

    System.out.println(new Solution().preorderTraversal(null));

    var root3 = new TreeNode(1);
    System.out.println(new Solution().preorderTraversal(root3));
  }

}
