package leetcode.doublylinkedlist;

public class MyDoublyLinkedList {

  private MyListNode head;
  private MyListNode tail;
  private int size;

  public MyDoublyLinkedList() {
    head = null;
    tail = null;
  }

  public void add(Object value) {
    MyListNode newNode = new MyListNode(value);
    newNode.prev = tail;
    if (head == null) {
      head = newNode;
      tail = head;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

  public int indexOf(Object value) {
    int index = 0;
    for (MyListNode curr = head; curr != null; curr = curr.next) {
      if ((curr.value == null && value == null) || (curr.value != null && curr.value.equals(value))) {
        return index;
      }
      index++;
    }
    return -1;
  }

  public int size() {
    return size;
  }

  public boolean remove(Object value) {
    for (MyListNode curr = head; curr != null; curr = curr.next) {
      if (remove(curr, value)) {
        return true;
      }
    }
    return false;
  }

  public int removeAll(Object value) {
    int i = 0;
    MyListNode curr = head;
    while (curr != null) {
      MyListNode node = curr;
      curr = curr.next;
      if (remove(node, value)) {
        i++;
      }
    }
    return i;
  }

  private boolean remove(MyListNode node, Object value) {
    if ((node.value == null && value == null) || (node.value != null && node.value.equals(value))) {
      if (node.prev != null) {
        node.prev.next = node.next;
      } else {
        head = node.next;
      }
      if (node.next != null) {
        node.next.prev = node.prev;
      } else {
        tail = node.prev;
      }
      node.prev = null;
      node.next = null;
      size--;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (MyListNode curr = head; curr != null; curr = curr.next) {
      sb.append(curr.value);
      if (curr.next != null) {
        sb.append("<->");
      }
    }
    return sb.toString();
  }

}

