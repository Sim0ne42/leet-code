package leetcode.intersectionoftwolinkedlists;

public class Main {

  public static void main(String[] args) {
    var common1 = new ListNode(8, new ListNode(4, new ListNode(5)));
    var listA1 = new ListNode(4, new ListNode(1, common1));
    var listB1 = new ListNode(5, new ListNode(6, new ListNode(1, common1)));
    System.out.println(new Solution().getIntersectionNode(listA1, listB1));

    var common2 = new ListNode(2, new ListNode(4));
    var listA2 = new ListNode(1, new ListNode(9, new ListNode(1, common2)));
    var listB2 = new ListNode(3, common2);
    System.out.println(new Solution().getIntersectionNode(listA2, listB2));

    var listA3 = new ListNode(2, new ListNode(6, new ListNode(4)));
    var listB3 = new ListNode(1, new ListNode(5));
    System.out.println(new Solution().getIntersectionNode(listA3, listB3));
  }

}
