package leetcode.kthsmallestelementinabst;

public class Main {

  public static void main(String[] args) {
    TreeNode root1 = new TreeNode(3,
        new TreeNode(1, null, new TreeNode(2)),
        new TreeNode(4, null, null));
    int k1 = 1;
    System.out.println(new Solution().kthSmallest(root1, k1));

    TreeNode root2 = new TreeNode(5,
        new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
        new TreeNode(6));
    int k2 = 3;
    System.out.println(new Solution().kthSmallest(root2, k2));
  }

}
