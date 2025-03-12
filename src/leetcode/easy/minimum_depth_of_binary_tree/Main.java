package leetcode.easy.minimum_depth_of_binary_tree;

public class Main {

  public static void main(String[] args) {
    var root1 = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    System.out.println(new Solution().minDepth(root1));
    System.out.println(new Solution().minDepthRec(root1));

    var root2 = new TreeNode(2,
        null,
        new TreeNode(3,
            null,
            new TreeNode(4,
                null,
                new TreeNode(5,
                    null,
                    new TreeNode(6)))));
    System.out.println(new Solution().minDepth(root2));
    System.out.println(new Solution().minDepthRec(root2));
  }

}
