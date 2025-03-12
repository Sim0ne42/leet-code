package leetcode.easy.palindrome_linked_list;

import java.util.LinkedList;

public class Solution {

  public boolean isPalindrome(ListNode head) {
    var stack = new LinkedList<ListNode>();
    int n = 0;
    for (ListNode node = head; node != null; node = node.next) {
      stack.push(node);
      n++;
    }

    int i = 0;
    int j = n - 1;
    while (i < j) {
      var node = stack.pop();
      if (head.val != node.val) {
        return false;
      }
      head = head.next;
      i++;
      j--;
    }

    return true;
  }

}
