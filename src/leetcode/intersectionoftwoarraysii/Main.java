package leetcode.intersectionoftwoarraysii;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 2, 1};
    int[] nums2 = new int[]{2, 2};
    System.out.println(Arrays.stream(new Solution().intersect(nums1, nums2)).boxed().collect(Collectors.toList()));

    int[] nums3 = new int[]{4, 9, 5};
    int[] nums4 = new int[]{9, 4, 9, 8, 4};
    System.out.println(Arrays.stream(new Solution().intersect(nums3, nums4)).boxed().collect(Collectors.toList()));

    int[] nums5 = new int[]{1, 2};
    int[] nums6 = new int[]{1, 1};
    System.out.println(Arrays.stream(new Solution().intersect(nums5, nums6)).boxed().collect(Collectors.toList()));
  }

}
