package leetcode.easy.linked_list_cycle;

public class Main {

  public static void main(String[] args) {
    var head1 = new ListNode(3);
    var node1 = new ListNode(2);
    var node2 = new ListNode(0);
    var node3 = new ListNode(-4);
    head1.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node1;
    System.out.println(new Solution().hasCycle(head1));

    var head2 = new ListNode(1);
    var node4 = new ListNode(2);
    head2.next = node4;
    node4.next = head2;
    System.out.println(new Solution().hasCycle(head2));

    var head3 = new ListNode(1);
    System.out.println(new Solution().hasCycle(head3));
  }

}
