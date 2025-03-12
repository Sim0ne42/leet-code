package leetcode.easy.length_of_last_word;

public class Solution {

  public int lengthOfLastWord(String s) {
    s = s.trim();
    var chars = s.toCharArray();

    var index = 0;
    for (int i = chars.length - 1; i > 0; i--) {
      if (chars[i] == ' ') {
        index = i + 1;
        break;
      }
    }

    return s.length() - index;
  }

}
