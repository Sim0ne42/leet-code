package leetcode.medium.add_two_numbers;

public class Main {

  public static void main(String[] args) {
    var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    System.out.println("l1: " + l1);
    var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    System.out.println("l2: " + l2);

    var result = new Solution().addTwoNumbers(l1, l2);
    System.out.println("result: " + result);
  }

}
