package leetcode.easy.move_zeroes;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{0, 1, 0, 3, 12};
    new Solution().moveZeroes(nums1);
    System.out.println(Arrays.toString(nums1));

    int[] nums2 = new int[]{0};
    new Solution().moveZeroes(nums2);
    System.out.println(Arrays.toString(nums2));
  }

}
