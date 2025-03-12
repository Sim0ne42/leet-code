package leetcode.medium.top_k_frequent_elements;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 1, 1, 2, 2, 3};
    int k1 = 2;
    System.out.println(Arrays.toString(new Solution().topKFrequent(nums1, k1)));

    int[] nums2 = new int[]{1};
    int k2 = 1;
    System.out.println(Arrays.toString(new Solution().topKFrequent(nums2, k2)));
  }

}
