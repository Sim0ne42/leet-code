package leetcode.populatingnextrightpointersineachnode;

import java.util.LinkedList;

public class Solution {

  public Node connect(Node root) {
    if (root == null || root.left == null && root.right == null) {
      return root;
    }
    LinkedList<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        Node node = queue.pop();
        node.next = i < size - 1 ? queue.getFirst() : null;
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
    }

    return root;
  }

}
