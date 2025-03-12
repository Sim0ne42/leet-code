package leetcode.easy.contains_duplicate;

import java.util.Arrays;

public class Solution {

  public boolean containsDuplicate(int[] nums) {
    return Arrays.stream(nums).distinct().count() < nums.length;
  }

}
