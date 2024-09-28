package leetcode.longestpalindrome;

public class Solution {

  public String longestPalindrome(String s) {
    var maxLength = 0;
    var longestPalindrome = "";

    for (var i = 0; i < s.length() && maxLength < s.length() - i; i++) {
      var builder = new StringBuilder();
      for (var j = i; j < s.length(); j++) {
        builder.append(s.charAt(j));
        if (isPalindrome(builder)) {
          var length = builder.length();
          if (length > maxLength) {
            maxLength = length;
            longestPalindrome = builder.toString();
          }
        }
      }
    }

    return longestPalindrome;
  }

  private boolean isPalindrome(StringBuilder s) {
    var i = 0;
    var j = s.length() - 1;
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
