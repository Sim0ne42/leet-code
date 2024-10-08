package leetcode.doublylinkedlist;

public class Main {

  public static void main(String[] args) {
    MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList();
    myDoublyLinkedList.add("Ciao");
    myDoublyLinkedList.add("Ciao");
    myDoublyLinkedList.add("Ciao");
    myDoublyLinkedList.add("Hello");
    myDoublyLinkedList.add("World");
    System.out.println(myDoublyLinkedList);
    System.out.println("Size: " + myDoublyLinkedList.size());
    System.out.println("Remove element: " + myDoublyLinkedList.remove("Ciao"));
    System.out.println(myDoublyLinkedList);
    System.out.println("Size: " + myDoublyLinkedList.size());
    System.out.println("Remove all elements: " + myDoublyLinkedList.removeAll("Ciao"));
    System.out.println(myDoublyLinkedList);
    System.out.println("Size: " + myDoublyLinkedList.size());
    System.out.println("Index: " + myDoublyLinkedList.indexOf("Hello"));
    System.out.println("Index: " + myDoublyLinkedList.indexOf("World"));
  }

}
