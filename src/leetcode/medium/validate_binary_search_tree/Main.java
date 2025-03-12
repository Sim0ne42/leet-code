package leetcode.medium.validate_binary_search_tree;

public class Main {

  public static void main(String[] args) {
    var root1 = new TreeNode(2,
        new TreeNode(1),
        new TreeNode(3));
    System.out.println(new Solution().isValidBST(root1));

    var root2 = new TreeNode(5,
        new TreeNode(1),
        new TreeNode(4, new TreeNode(3), new TreeNode(6)));
    System.out.println(new Solution().isValidBST(root2));

    var root3 = new TreeNode(5,
        new TreeNode(4),
        new TreeNode(6, new TreeNode(3), new TreeNode(7)));
    System.out.println(new Solution().isValidBST(root3));
  }

}
