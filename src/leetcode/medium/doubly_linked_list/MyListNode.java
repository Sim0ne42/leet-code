package leetcode.medium.doubly_linked_list;

public class MyListNode {

  Object value;
  MyListNode next;
  MyListNode prev;

  public MyListNode(Object value) {
    this.value = value;
    this.next = null;
    this.prev = null;
  }

  public MyListNode(Object value, MyListNode next, MyListNode prev) {
    this.value = value;
    this.next = next;
    this.prev = prev;
  }

  @Override
  public String toString() {
    return "[" + value + ", " + next + ", " + prev + "]";
  }

}
