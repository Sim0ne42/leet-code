package leetcode.easy.find_the_town_judge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {

  public int findJudge(int n, int[][] trust) {
    if (n == 1) {
      return 1;
    }

    Map<Integer, Integer> trustOccurrences = new HashMap<>();
    Set<Integer> peopleWhoTrust = new HashSet<>();

    for (int[] ints : trust) {
      peopleWhoTrust.add(ints[0]);
      trustOccurrences.compute(ints[1], (k, v) -> v == null ? 1 : v + 1);
    }

    for (Entry<Integer, Integer> entry : trustOccurrences.entrySet()) {
      if (entry.getValue() == n - 1 && !peopleWhoTrust.contains(entry.getKey())) {
        return entry.getKey();
      }
    }

    return -1;
  }

}
