package leetcode.searchinrotatedsortedarray;

public class Solution {

  public int search(int[] nums, int target) {
    int i = 0;
    int j = nums.length - 1;

    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[i] == target) {
        return i;
      }
      if (nums[j] == target) {
        return j;
      }
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[i] < nums[mid]) {
        if (nums[i] < target && nums[mid] > target) {
          j = mid - 1;
        } else {
          i = mid + 1;
        }
      } else {
        if (nums[j] > target && nums[mid] < target) {
          i = mid + 1;
        } else {
          j = mid - 1;
        }
      }
    }

    return -1;
  }

}
