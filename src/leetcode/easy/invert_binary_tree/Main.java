package leetcode.easy.invert_binary_tree;

public class Main {

  public static void main(String[] args) {
    var root1 = new TreeNode(4,
        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
        new TreeNode(7, new TreeNode(6), new TreeNode(9)));
    System.out.println(new Solution().invertTree(root1));
    System.out.println(new Solution().invertTreeRec(root1));
    System.out.println();

    var root2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    System.out.println(new Solution().invertTree(root2));
    System.out.println(new Solution().invertTreeRec(root2));
  }

}
