package leetcode.medium.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      map.compute(new String(chars), (k, v) -> v == null ? new LinkedList<>() : v).add(str);
    }

    return new ArrayList<>(map.values());
  }

}
