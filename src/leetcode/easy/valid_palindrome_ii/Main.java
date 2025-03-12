package leetcode.easy.valid_palindrome_ii;

public class Main {

  public static void main(String[] args) {
    String s1 = "aba";
    System.out.println(new Solution().validPalindrome(s1));

    String s2 = "abca";
    System.out.println(new Solution().validPalindrome(s2));

    String s3 = "abc";
    System.out.println(new Solution().validPalindrome(s3));

    String s4 = "ebcbbececabbacecbbcbe";
    String s5 = "cecabbacec";
    System.out.println(new Solution().validPalindrome(s4));
  }

}
