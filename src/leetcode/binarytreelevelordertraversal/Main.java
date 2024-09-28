package leetcode.binarytreelevelordertraversal;

public class Main {

  public static void main(String[] args) {
    var node1 = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    System.out.println(new Solution().levelOrder(node1));

    var node2 = new TreeNode(1);
    System.out.println(new Solution().levelOrder(node2));

    System.out.println(new Solution().levelOrder(null));

    var node3 = new TreeNode(1,
        new TreeNode(2, new TreeNode(4), null),
        new TreeNode(3, null, new TreeNode(5))
    );
    System.out.println(new Solution().levelOrder(node3));
  }

}
