package leetcode.easy.find_the_difference_of_two_arrays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {

  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    for (int i : nums1) {
      set1.add(i);
    }
    Set<Integer> set2 = new HashSet<>();
    for (int i : nums2) {
      set2.add(i);
    }

    List<Integer> list1 = new LinkedList<>();
    for (Integer i : set1) {
      if (!set2.contains(i)) {
        list1.add(i);
      }
    }
    List<Integer> list2 = new LinkedList<>();
    for (Integer i : set2) {
      if (!set1.contains(i)) {
        list2.add(i);
      }
    }

    return List.of(list1, list2);
  }

}
