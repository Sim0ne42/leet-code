package leetcode.easy.missing_number;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{3, 0, 1};
    System.out.println(new Solution().missingNumber(nums1));

    int[] nums2 = new int[]{0, 1};
    System.out.println(new Solution().missingNumber(nums2));

    int[] nums3 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
    System.out.println(new Solution().missingNumber(nums3));
  }

}
