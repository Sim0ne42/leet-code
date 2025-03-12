package leetcode.easy.check_if_one_string_swap_can_make_strings_equal;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public boolean areAlmostEqual(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    boolean swap = false;
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        if (map.containsKey(s1.charAt(i))) {
          if (swap || s1.charAt(i) != s2.charAt(map.get(s1.charAt(i)))) {
            return false;
          } else {
            swap = true;
            map.remove(s1.charAt(i));
            map.remove(s2.charAt(i));
          }
        } else {
          map.put(s1.charAt(i), i);
          map.put(s2.charAt(i), i);
        }
      }
    }

    return map.isEmpty();
  }

}
