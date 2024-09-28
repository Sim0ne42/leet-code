package leetcode.palindromelinkedlist;

public class Main {

  public static void main(String[] args) {
    var head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
    System.out.println(new Solution().isPalindrome(head1));

    var head2 = new ListNode(1, new ListNode(2));
    System.out.println(new Solution().isPalindrome(head2));
  }

}
