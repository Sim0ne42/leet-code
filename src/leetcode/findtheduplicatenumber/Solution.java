package leetcode.findtheduplicatenumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public int findDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      if (set.contains(num)) {
        return num;
      }
      set.add(num);
    }

    return -1;
  }

}
