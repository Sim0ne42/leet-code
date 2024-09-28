package leetcode.binarytreeinordertraversal;

public class Main {

  public static void main(String[] args) {
    var node1 = new TreeNode(1, null,
        new TreeNode(2, new TreeNode(3), null));
    System.out.println(new Solution().inorderTraversal(node1));
    System.out.println(new Solution().inorderTraversalRec(node1));

    var node2 = new TreeNode(1,
        new TreeNode(2,
            new TreeNode(4),
            new TreeNode(5, new TreeNode(6), new TreeNode(7))),
        new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));
    System.out.println(new Solution().inorderTraversal(node2));
    System.out.println(new Solution().inorderTraversalRec(node2));
  }

}
