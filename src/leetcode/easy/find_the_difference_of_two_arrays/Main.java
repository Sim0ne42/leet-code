package leetcode.easy.find_the_difference_of_two_arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 3};
    int[] nums2 = new int[]{2, 4, 6};
    System.out.println(new Solution().findDifference(nums1, nums2));

    int[] nums3 = new int[]{1, 2, 3, 3};
    int[] nums4 = new int[]{1, 1, 2, 2};
    System.out.println(new Solution().findDifference(nums3, nums4));
  }

}
