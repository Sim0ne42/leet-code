package leetcode.medium.remove_nth_node_from_end_of_list;

public class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    return "[" + val + ", " + next + "]";
  }

}
