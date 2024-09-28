package leetcode.climbingstairs;

public class Solution {

  public int climbStairsRec(int n) {
    if (n <= 1) {
      return 1;
    }
    return climbStairsRec(n - 1) + climbStairsRec(n - 2);
  }

  public int climbStairs(int n) {
    if (n <= 2) {
      return n;
    }

    int[] dp = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }

}
