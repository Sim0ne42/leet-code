package leetcode.easy.remove_element;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int removeElement(int[] nums, int val) {
    List<Integer> list = new ArrayList<>();
    for (int num : nums) {
      if (num != val) {
        list.add(num);
      }
    }
    for (int i = 0; i < list.size(); i++) {
      nums[i] = list.get(i);
    }
    for (int i = list.size(); i < nums.length; i++) {
      nums[i] = val;
    }
    return list.size();
  }

}
