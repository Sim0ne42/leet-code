package leetcode.longestcommonprefix;

public class Solution {

  public String longestCommonPrefix(String[] strs) {
    int minLength = Integer.MAX_VALUE;
    for (String str : strs) {
      minLength = Math.min(minLength, str.length());
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < minLength; i++) {
      char character = strs[0].charAt(i);
      boolean isCommon = true;
      for (int j = 1; j < strs.length; j++) {
        if (character != strs[j].charAt(i)) {
          isCommon = false;
          break;
        }
      }
      if (isCommon) {
        builder.append(character);
      } else {
        return builder.toString();
      }
    }

    return builder.toString();
  }

}
