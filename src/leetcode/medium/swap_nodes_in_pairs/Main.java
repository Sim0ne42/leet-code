package leetcode.medium.swap_nodes_in_pairs;

public class Main {

  public static void main(String[] args) {
    var head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    System.out.println(new Solution().swapPairs(head1));

    var head2 = new ListNode();
    System.out.println(new Solution().swapPairs(head2));

    var head3 = new ListNode(1);
    System.out.println(new Solution().swapPairs(head3));

    var head4 = new ListNode(1, new ListNode(2, new ListNode(3)));
    System.out.println(new Solution().swapPairs(head4));
  }

}
