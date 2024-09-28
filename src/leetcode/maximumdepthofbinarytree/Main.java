package leetcode.maximumdepthofbinarytree;

public class Main {

  public static void main(String[] args) {
    var node1 = new TreeNode(3,
        new TreeNode(9),
        new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    System.out.println(new Solution().maxDepthRec(node1));
    System.out.println(new Solution().maxDepthBfs(node1));
    System.out.println(new Solution().maxDepthDfs(node1));

    var node2 = new TreeNode(1, null, new TreeNode(2));
    System.out.println(new Solution().maxDepthRec(node2));
    System.out.println(new Solution().maxDepthBfs(node2));
    System.out.println(new Solution().maxDepthDfs(node2));
  }

}
