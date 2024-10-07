package leetcode.deletenodeinalinkedlist;

public class Main {

  public static void main(String[] args) {
    var node1 = new ListNode(5, new ListNode(1));
    new Solution().deleteNode(node1);
    System.out.println(node1);

    var node2 = new ListNode(1, new ListNode(9));
    new Solution().deleteNode(node2);
    System.out.println(node2);
  }

}
