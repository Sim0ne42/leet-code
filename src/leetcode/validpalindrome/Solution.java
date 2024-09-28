package leetcode.validpalindrome;

public class Solution {

  public boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
      char ci = Character.toLowerCase(s.charAt(i));
      char cj = Character.toLowerCase(s.charAt(j));
      if (isValid(ci) && isValid(cj)) {
        if (ci != cj) {
          return false;
        }
        i++;
        j--;
      } else if (!isValid(ci)) {
        i++;
      } else {
        j--;
      }
    }

    return true;
  }

  private boolean isValid(Character c) {
    return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
  }

}
