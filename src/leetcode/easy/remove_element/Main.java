package leetcode.easy.remove_element;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{3, 2, 2, 3};
    int val1 = 3;
    System.out.println(new Solution().removeElement(nums1, val1));
    System.out.println(Arrays.toString(nums1));

    int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
    int val2 = 2;
    System.out.println(new Solution().removeElement(nums2, val2));
    System.out.println(Arrays.toString(nums2));
  }

}
