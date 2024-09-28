package leetcode.containsduplicate;

import java.util.Arrays;

public class Solution {

  public boolean containsDuplicate(int[] nums) {
    return Arrays.stream(nums).distinct().count() < nums.length;
  }

}
