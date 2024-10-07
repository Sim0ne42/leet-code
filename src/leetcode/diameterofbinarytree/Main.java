package leetcode.diameterofbinarytree;

public class Main {

  public static void main(String[] args) {
    TreeNode root1 = new TreeNode(1,
        new TreeNode(2, new TreeNode(4), new TreeNode(5)),
        new TreeNode(3));
    System.out.println(new Solution().diameterOfBinaryTree(root1));

    TreeNode root2 = new TreeNode(1, new TreeNode(2), null);
    System.out.println(new Solution().diameterOfBinaryTree(root2));
  }

}
