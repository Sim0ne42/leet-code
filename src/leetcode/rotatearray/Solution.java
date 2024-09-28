package leetcode.rotatearray;

public class Solution {

  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int n = nums.length;
    int index = n - k - 1;

    int[] copy = new int[k];
    System.arraycopy(nums, index + 1, copy, 0, copy.length);

    for (int i = index; i >= 0; i--) {
      nums[i + k] = nums[i];
    }
    System.arraycopy(copy, 0, nums, 0, copy.length);
  }

}
