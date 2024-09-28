package leetcode.sortcolors;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{2, 0, 2, 1, 1, 0};
    new Solution().sortColors(nums1);
    System.out.println(Arrays.toString(nums1));

    int[] nums2 = new int[]{2, 0, 1};
    new Solution().sortColors(nums2);
    System.out.println(Arrays.toString(nums2));

    int[] nums3 = new int[]{0};
    new Solution().sortColors(nums3);
    System.out.println(Arrays.toString(nums3));
  }

}
