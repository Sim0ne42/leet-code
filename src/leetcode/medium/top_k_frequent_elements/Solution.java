package leetcode.medium.top_k_frequent_elements;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> occurrences = new HashMap<>();
    for (int num : nums) {
      occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
    }

    return occurrences.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(k)
        .map(Entry::getKey)
        .mapToInt(it -> it)
        .toArray();
  }

}
