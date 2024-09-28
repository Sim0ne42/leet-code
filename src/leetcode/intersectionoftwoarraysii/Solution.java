package leetcode.intersectionoftwoarraysii;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

  public int[] intersect(int[] nums1, int[] nums2) {
    int[] nums = nums1.length < nums2.length ? nums1 : nums2;
    Map<Integer, Integer> occurrencesMap = new HashMap<>();
    for (int num : nums) {
      occurrencesMap.compute(num, (k, v) -> v == null ? 1 : v + 1);
    }

    nums = nums1.length >= nums2.length ? nums1 : nums2;
    List<Integer> intersection = new LinkedList<>();
    for (int num : nums) {
      if (occurrencesMap.containsKey(num) && occurrencesMap.get(num) > 0) {
        intersection.add(num);
        occurrencesMap.put(num, occurrencesMap.get(num) - 1);
      }
    }

    return intersection.stream().mapToInt(i -> i).toArray();
  }

}
