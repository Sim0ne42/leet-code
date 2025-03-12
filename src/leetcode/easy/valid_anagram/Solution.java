package leetcode.easy.valid_anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class Solution {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> sMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
    }

    Map<Character, Integer> tMap = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
      tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
    }

    for (Entry<Character, Integer> entry : sMap.entrySet()) {
      if (!Objects.equals(tMap.get(entry.getKey()), entry.getValue())) {
        return false;
      }
    }

    return true;
  }

}
