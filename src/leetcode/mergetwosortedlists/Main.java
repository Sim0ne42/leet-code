package leetcode.mergetwosortedlists;

public class Main {

  public static void main(String[] args) {
    var list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    var list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    System.out.println(new Solution().mergeTwoLists(list1, list2));

    System.out.println(new Solution().mergeTwoLists(null, null));

    System.out.println(new Solution().mergeTwoLists(null, new ListNode(0)));
  }

}
