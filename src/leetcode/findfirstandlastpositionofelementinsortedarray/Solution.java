package leetcode.findfirstandlastpositionofelementinsortedarray;

public class Solution {

  public int[] searchRange(int[] nums, int target) {
    int firstPosition = -1;
    int i = 0;
    int j = nums.length - 1;

    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] == target && (mid == 0 || nums[mid - 1] < target)) {
        firstPosition = mid;
        break;
      } else if (nums[mid] > target || (mid > 0 && nums[mid - 1] == target)) {
        j = mid - 1;
      } else {
        i = mid + 1;
      }
    }

    int lastPosition = -1;
    i = 0;
    j = nums.length - 1;
    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] > target)) {
        lastPosition = mid;
        break;
      } else if (nums[mid] < target || (mid < nums.length - 1 && nums[mid + 1] == target)) {
        i = mid + 1;
      } else {
        j = mid - 1;
      }
    }

    return new int[]{firstPosition, lastPosition};
  }

}
