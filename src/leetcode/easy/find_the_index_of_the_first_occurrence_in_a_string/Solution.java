package leetcode.easy.find_the_index_of_the_first_occurrence_in_a_string;

public class Solution {

  public int strStr(String haystack, String needle) {
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      if (haystack.startsWith(needle, i)) {
        return i;
      }
    }
    return -1;
  }

}
