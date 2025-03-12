package leetcode.easy.roman_to_integer;

import java.util.Map;

public class Solution {

  private static final Map<Character, Integer> map = Map.of(
      'I', 1,
      'V', 5,
      'X', 10,
      'L', 50,
      'C', 100,
      'D', 500,
      'M', 1000
  );

  public int romanToInt(String s) {
    if (s == null || s.isEmpty() || !map.containsKey(s.charAt(s.length() - 1))) {
      return 0;
    }

    int result = map.get(s.charAt(s.length() - 1));
    for (int i = s.length() - 2; i >= 0; i--) {
      if (map.containsKey(s.charAt(i))) {
        if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
          result -= map.get(s.charAt(i));
        } else {
          result += map.get(s.charAt(i));
        }
      } else {
        return 0;
      }
    }
    return result;
  }

}
