package leetcode.findtheduplicatenumber;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 3, 4, 2, 2};
    System.out.println(new Solution().findDuplicate(nums1));

    int[] nums2 = new int[]{3, 1, 3, 4, 2};
    System.out.println(new Solution().findDuplicate(nums2));

    int[] nums3 = new int[]{3, 3, 3, 3, 3};
    System.out.println(new Solution().findDuplicate(nums3));

    int[] nums4 = new int[]{8, 7, 1, 10, 17, 15, 18, 11, 16, 9, 19, 12, 5, 14, 3, 4, 2, 13, 18, 18};
    System.out.println(new Solution().findDuplicate(nums4));
  }

}
