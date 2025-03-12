package leetcode.medium.product_of_array_except_self;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 3, 4};
    System.out.println(Arrays.toString(new Solution().productExceptSelf(nums1)));

    int[] nums2 = new int[]{-1, 1, 0, -3, 3};
    System.out.println(Arrays.toString(new Solution().productExceptSelf(nums2)));
  }

}
