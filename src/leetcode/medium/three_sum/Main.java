package leetcode.medium.three_sum;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = {-1, 0, 1, 2, -1, -4};
    System.out.println(new Solution().threeSum(nums1));

    int[] nums2 = {0, 1, 1};
    System.out.println(new Solution().threeSum(nums2));

    int[] nums3 = {0, 0, 0};
    System.out.println(new Solution().threeSum(nums3));
  }

}
