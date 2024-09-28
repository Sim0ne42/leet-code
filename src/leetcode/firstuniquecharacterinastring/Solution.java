package leetcode.firstuniquecharacterinastring;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public int firstUniqChar(String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      map.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      if (map.get(s.charAt(i)) == 1) {
        return i;
      }
    }

    return -1;
  }

}
