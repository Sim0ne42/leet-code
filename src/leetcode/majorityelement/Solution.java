package leetcode.majorityelement;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > nums.length / 2) {
        return entry.getKey();
      }
    }

    return -1;
  }

}
