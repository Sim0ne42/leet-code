package leetcode.oddevenlinkedlist;

public class Main {

  public static void main(String[] args) {
    ListNode head1 = new ListNode(1,
        new ListNode(2,
            new ListNode(3,
                new ListNode(4,
                    new ListNode(5)))));
    System.out.println(new Solution().oddEvenList(head1));
    System.out.println();

    ListNode head2 = new ListNode(2,
        new ListNode(1,
            new ListNode(3,
                new ListNode(5,
                    new ListNode(6,
                        new ListNode(4,
                            new ListNode(7)))))));
    System.out.println(new Solution().oddEvenList(head2));
  }

}
