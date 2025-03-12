package leetcode.medium.longest_palindromic_substring;

public class Main {

  public static void main(String[] args) {
    String s1 = "babad";
    System.out.println(new Solution().longestPalindrome(s1));

    String s2 = "cbbd";
    System.out.println(new Solution().longestPalindrome(s2));

    String s3 = "ababaza";
    System.out.println(new Solution().longestPalindrome(s3));

    String s4 = "a";
    System.out.println(new Solution().longestPalindrome(s4));
  }

}
