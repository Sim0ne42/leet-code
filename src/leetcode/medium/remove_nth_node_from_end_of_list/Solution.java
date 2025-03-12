package leetcode.medium.remove_nth_node_from_end_of_list;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    List<ListNode> nodes = new ArrayList<>();

    int i = 0;
    while (head != null) {
      nodes.add(head);
      head = head.next;
      i++;
    }

    int index = i - n;
    if (i == 1) {
      return null;
    }
    if (index == 0) {
      return nodes.get(1);
    }

    nodes.get(index - 1).next = nodes.get(index).next;
    return nodes.get(0);
  }

}
