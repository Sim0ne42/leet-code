package leetcode.removenthnodefromendoflist;

public class Main {

  public static void main(String[] args) {
    ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    System.out.println(new Solution().removeNthFromEnd(head1, 2));

    ListNode head2 = new ListNode(1);
    System.out.println(new Solution().removeNthFromEnd(head2, 1));

    ListNode head3 = new ListNode(1, new ListNode(2));
    System.out.println(new Solution().removeNthFromEnd(head3, 1));
  }

}
