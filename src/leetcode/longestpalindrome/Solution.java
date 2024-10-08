package leetcode.longestpalindrome;

public class Solution {

  public String longestPalindrome(String s) {
    int maxLength = 0;
    String longestPalindrome = "";

    for (int i = 0; i < s.length() && maxLength < s.length() - i; i++) {
      StringBuilder builder = new StringBuilder();
      for (int j = i; j < s.length(); j++) {
        int length = j - i + 1;
        builder.append(s.charAt(j));
        if (maxLength < length && isPalindrome(s, i, j)) {
          maxLength = length;
          longestPalindrome = builder.toString();
        }
      }
    }

    return longestPalindrome;
  }

  private boolean isPalindrome(String s, int i, int j) {
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

}
