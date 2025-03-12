package leetcode.easy.symmetric_tree;

public class Main {

  public static void main(String[] args) {
    var node1 = new TreeNode(1,
        new TreeNode(2, new TreeNode(3), new TreeNode(4)),
        new TreeNode(2, new TreeNode(4), new TreeNode(3)));
    System.out.println("result rec: " + new SolutionRec().isSymmetric(node1));
    System.out.println("result: " + new Solution().isSymmetric(node1));
    System.out.println();

    var node2 = new TreeNode(1,
        new TreeNode(2, null, new TreeNode(3)),
        new TreeNode(2, null, new TreeNode(3)));
    System.out.println("result rec: " + new SolutionRec().isSymmetric(node2));
    System.out.println("result: " + new Solution().isSymmetric(node2));
    System.out.println();

    var node3 = new TreeNode(1, new TreeNode(0), null);
    System.out.println("result rec: " + new SolutionRec().isSymmetric(node3));
    System.out.println("result: " + new Solution().isSymmetric(node3));
    System.out.println();

    var node4 = new TreeNode(1, null, null);
    System.out.println("result rec: " + new SolutionRec().isSymmetric(node4));
    System.out.println("result: " + new Solution().isSymmetric(node4));
    System.out.println();

    var node5 = new TreeNode(1,
        new TreeNode(2, null, new TreeNode(3)),
        new TreeNode(2, new TreeNode(3), null));
    System.out.println("result rec: " + new SolutionRec().isSymmetric(node5));
    System.out.println("result: " + new Solution().isSymmetric(node5));
    System.out.println();
  }

}
