package leetcode.easy.intersection_of_two_linked_lists;

public class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }

  ListNode(int x, ListNode next) {
    val = x;
    this.next = next;
  }

  @Override
  public String toString() {
    return "[" + val + "," + next + "]";
  }

}
