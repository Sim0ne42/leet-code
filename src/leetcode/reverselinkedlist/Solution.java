package leetcode.reverselinkedlist;

public class Solution {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode cur = head;
    while (cur != null) {
      ListNode next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }

  public ListNode reverseListRec(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode prev = reverseListRec(head.next);
    head.next.next = head;
    head.next = null;
    return prev;
  }

}
