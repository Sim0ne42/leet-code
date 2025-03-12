package leetcode.easy.reverse_string;

public class Main {

  public static void main(String[] args) {
    var s1 = "hello".toCharArray();
    new Solution().reverseString(s1);
    System.out.println(s1);

    var s2 = "Hannah".toCharArray();
    new Solution().reverseString(s2);
    System.out.println(s2);
  }

}
