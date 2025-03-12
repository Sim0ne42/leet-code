package leetcode.medium.odd_even_linked_list;

public class Solution {

  public ListNode oddEvenList(ListNode head) {
    ListNode currOdd = new ListNode(0);
    ListNode firstOdd = currOdd;
    ListNode currEven = new ListNode(0);
    ListNode firstEven = currEven;

    for (int i = 1; head != null; head = head.next, i++) {
      if (i % 2 == 0) {
        currEven.next = head;
        currEven = currEven.next;
      } else {
        currOdd.next = head;
        currOdd = currOdd.next;
      }
    }

    currOdd.next = firstEven.next;
    currEven.next = null;
    return firstOdd.next;
  }

}
