package leetcode.medium.longest_substring_without_repeating_characters;

import java.util.HashMap;

public class Solution {

  public int lengthOfLongestSubstring(String s) {
    var charIndexMap = new HashMap<Character, Integer>();
    var maxSubstringLength = 0;
    var i = 0;

    while (i < s.length()) {
      if (charIndexMap.containsKey(s.charAt(i))) {
        maxSubstringLength = Math.max(maxSubstringLength, charIndexMap.size());
        i = charIndexMap.get(s.charAt(i)) + 1;
        charIndexMap.clear();
      } else {
        charIndexMap.put(s.charAt(i), i);
        if (i + 1 == s.length()) {
          maxSubstringLength = Math.max(maxSubstringLength, charIndexMap.size());
        }
        i++;
      }
    }

    return maxSubstringLength;
  }

}
