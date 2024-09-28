package leetcode.uniquenumberofoccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {

  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer, Integer> occurrencesMap = new HashMap<>();
    for (int num : arr) {
      occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
    }
    return occurrencesMap.size() == new HashSet<>(occurrencesMap.values()).size();
  }

}
