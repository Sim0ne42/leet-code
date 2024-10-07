package leetcode.mergeintervals;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[][] intervals1 = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    System.out.println(Arrays.deepToString(new Solution().merge(intervals1)));

    int[][] intervals2 = new int[][]{{1, 4}, {4, 5}};
    System.out.println(Arrays.deepToString(new Solution().merge(intervals2)));
  }

}
