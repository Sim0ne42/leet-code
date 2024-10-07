package leetcode.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    List<int[]> result = new ArrayList<>();

    for (int[] interval : intervals) {
      if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
        result.add(interval);
      } else {
        result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
      }
    }

    return result.toArray(new int[result.size()][]);
  }

}
