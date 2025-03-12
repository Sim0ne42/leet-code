package leetcode.medium.rotate_array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 3, 4, 5, 6, 7};
    int k1 = 3;
    new Solution().rotate(nums1, k1);
    System.out.println(Arrays.stream(nums1).boxed().collect(Collectors.toList()));

    int[] nums2 = new int[]{-1, -100, 3, 99};
    int k2 = 2;
    new Solution().rotate(nums2, k2);
    System.out.println(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
  }

}
