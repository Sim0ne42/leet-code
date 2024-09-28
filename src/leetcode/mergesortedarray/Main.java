package leetcode.mergesortedarray;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
    new Solution().merge(nums1, 3, new int[]{2, 5, 6}, 3);
    System.out.println(nums1);

    int[] nums2 = new int[]{1};
    new Solution().merge(nums1, 1, new int[0], 0);
    System.out.println(nums2);

    int[] nums3 = new int[0];
    new Solution().merge(nums1, 0, new int[0], 0);
    System.out.println(nums3);
  }

}
