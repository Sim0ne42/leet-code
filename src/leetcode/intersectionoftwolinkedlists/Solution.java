package leetcode.intersectionoftwolinkedlists;

public class Solution {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    var a = headA;
    var b = headB;

    while (a != b) {
      a = a == null ? headB : a.next;
      b = b == null ? headA : b.next;
    }

    return a;
  }

}
