package leetcode.easy.isomorphic_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

  public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    var sMap = buildMap(s);
    var tMap = buildMap(t);

    return sMap.values().stream().allMatch(tMap::containsValue);
  }

  private Map<Character, List<Integer>> buildMap(String s) {
    Map<Character, List<Integer>> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      var list = map.getOrDefault(s.charAt(i), new ArrayList<>());
      list.add(i);
      map.put(s.charAt(i), list);
    }

    return map;
  }

}
