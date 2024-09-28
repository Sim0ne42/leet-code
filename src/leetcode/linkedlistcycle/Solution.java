package leetcode.linkedlistcycle;

public class Solution {

  public boolean hasCycle(ListNode head) {
    var slowPointer = head;
    var fastPointer = head;

    while (fastPointer != null && fastPointer.next != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;

      if (slowPointer == fastPointer) {
        return true;
      }
    }

    return false;
  }

}
