package leetcode.easy.single_number;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{2, 2, 1};
    System.out.println(new Solution().singleNumber(nums1));

    int[] nums2 = new int[]{4, 1, 2, 1, 2};
    System.out.println(new Solution().singleNumber(nums2));

    int[] nums3 = new int[]{1};
    System.out.println(new Solution().singleNumber(nums3));
  }

}
