package leetcode.validpalindrome;

public class Main {

  public static void main(String[] args) {
    var s1 = "A man, a plan, a canal: Panama";
    System.out.println(new Solution().isPalindrome(s1));

    var s2 = "race a car";
    System.out.println(new Solution().isPalindrome(s2));

    var s3 = " ";
    System.out.println(new Solution().isPalindrome(s3));

    var s4 = "0P";
    System.out.println(new Solution().isPalindrome(s4));
  }

}
