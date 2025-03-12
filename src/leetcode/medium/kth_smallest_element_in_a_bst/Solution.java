package leetcode.medium.kth_smallest_element_in_a_bst;

import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {

  public int kthSmallest(TreeNode root, int k) {
    LinkedList<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    SortedSet<Integer> nodes = new TreeSet<>();
    while (!queue.isEmpty()) {
      TreeNode node = queue.pop();
      nodes.add(node.val);

      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }

    for (int i = 1; i < k; i++) {
      nodes.remove(nodes.first());
    }
    return nodes.first();
  }

}
