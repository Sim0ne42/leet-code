package leetcode.easy.merge_sorted_array;

public class Solution {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int index = m + n - 1;

    while (i >= 0 && j >= 0) {
      if (Math.max(nums1[i], nums2[j]) == nums1[i]) {
        nums1[index] = nums1[i];
        i--;
      } else {
        nums1[index] = nums2[j];
        j--;
      }
      index--;
    }

    while (i >= 0) {
      nums1[index] = nums1[i];
      index--;
      i--;
    }

    while (j >= 0) {
      nums1[index] = nums2[j];
      index--;
      j--;
    }
  }

}
