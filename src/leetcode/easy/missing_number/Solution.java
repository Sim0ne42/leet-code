package leetcode.easy.missing_number;

public class Solution {

  public int missingNumber(int[] nums) {
    int n = nums.length;
    int[] arr = new int[n];

    for (int num : nums) {
      if (num != n) {
        arr[num] = 1;
      }
    }

    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        return i;
      }
    }

    return n;
  }

}
