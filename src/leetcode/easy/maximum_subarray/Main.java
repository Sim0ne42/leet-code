package leetcode.easy.maximum_subarray;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(new Solution().maxSubArray(nums1));
    System.out.println(new Solution().maxSubArrayDp(nums1));

    int[] nums2 = new int[]{1};
    System.out.println(new Solution().maxSubArray(nums2));
    System.out.println(new Solution().maxSubArrayDp(nums2));

    int[] nums3 = new int[]{5, 4, -1, 7, 8};
    System.out.println(new Solution().maxSubArray(nums3));
    System.out.println(new Solution().maxSubArrayDp(nums3));

    int[] nums4 = new int[]{-1};
    System.out.println(new Solution().maxSubArray(nums4));
    System.out.println(new Solution().maxSubArrayDp(nums4));
  }

}
