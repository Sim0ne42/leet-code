package leetcode.medium.longest_consecutive_sequence;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

  public int longestConsecutive(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int min = 0;
    int max = 0;
    for (int num : nums) {
      min = Math.min(min, num);
      max = Math.max(max, num);
    }

    int n = max - min + 1;
    int[] dp = new int[n];
    for (int num : nums) {
      dp[num - min] = 1;
    }

    int result = 0;
    for (int i = 0; i < dp.length; i++) {
      int consecutive = 1;
      for (int j = i + 1; j < dp.length && dp[j] == 1 && dp[j - 1] == 1; j++) {
        consecutive++;
      }
      result = Math.max(result, consecutive);
    }

    return result;
  }

  public int longestConsecutiveN2(int[] nums) {
    Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

    int result = 0;
    for (int num : nums) {
      int consecutive = 1;
      for (int next = num + 1; set.contains(next); next++) {
        consecutive++;
      }
      result = Math.max(result, consecutive);
    }

    return result;
  }

  public int longestConsecutiveSort(int[] nums) {
    int n = nums.length;
    if (n < 2) {
      return n;
    }

    Arrays.sort(nums);
    int result = 1;
    int t = 1;
    for (int i = 1; i < n; ++i) {
      if (nums[i] != nums[i - 1]) {
        if (nums[i] == nums[i - 1] + 1) {
          result = Math.max(result, ++t);
        } else {
          t = 1;
        }
      }
    }

    return result;
  }

}
