package leetcode.medium.sort_colors;

public class Solution {

  public void sortColors(int[] nums) {
    int reds = 0;
    int whites = 0;
    int blues = 0;

    for (int num : nums) {
      if (num == 0) {
        reds++;
      } else if (num == 1) {
        whites++;
      } else {
        blues++;
      }
    }

    int index = 0;
    for (int i = 0; i < reds; i++) {
      nums[index] = 0;
      index++;
    }
    for (int i = 0; i < whites; i++) {
      nums[index] = 1;
      index++;
    }
    for (int i = 0; i < blues; i++) {
      nums[index] = 2;
      index++;
    }
  }

}
