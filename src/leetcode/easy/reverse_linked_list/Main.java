package leetcode.easy.reverse_linked_list;

public class Main {

  public static void main(String[] args) {
    var head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    System.out.println(new Solution().reverseList(head1));
    System.out.println(new Solution().reverseListRec(head1));
    System.out.println();

    var head2 = new ListNode(1, new ListNode(2));
    System.out.println(new Solution().reverseList(head2));
    System.out.println(new Solution().reverseListRec(head2));
    System.out.println();

    var head3 = new ListNode();
    System.out.println(new Solution().reverseList(head3));
    System.out.println(new Solution().reverseListRec(head3));
    System.out.println();

    System.out.println(new Solution().reverseList(null));
    System.out.println(new Solution().reverseListRec(null));
  }

}
