package leetcode.mergetwosortedlists;

public class Solution {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    var node1 = list1;
    var node2 = list2;
    var latestNode = new ListNode(0);
    var head = latestNode;

    while (node1 != null && node2 != null) {
      if (node1.val < node2.val) {
        latestNode.next = node1;
        latestNode = latestNode.next;
        node1 = node1.next;
      } else {
        latestNode.next = node2;
        latestNode = latestNode.next;
        node2 = node2.next;
      }
    }

    while (node1 != null) {
      latestNode.next = node1;
      latestNode = latestNode.next;
      node1 = node1.next;
    }
    while (node2 != null) {
      latestNode.next = node2;
      latestNode = latestNode.next;
      node2 = node2.next;
    }

    return head.next;
  }

}
