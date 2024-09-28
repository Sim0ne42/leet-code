package leetcode.validarentheses;

public class Main {

  public static void main(String[] args) {
    var s1 = "()";
    System.out.println(new Solution().isValid(s1));

    var s2 = "()[]{}";
    System.out.println(new Solution().isValid(s2));

    var s3 = "([])";
    System.out.println(new Solution().isValid(s3));

    var s4 = "[";
    System.out.println(new Solution().isValid(s4));
  }

}
