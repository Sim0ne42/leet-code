package leetcode.easy.two_sum;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{2, 7, 11, 15};
    int target1 = 9;
    System.out.println(new Solution().twoSum(nums1, target1).length);

    int[] nums2 = new int[]{3, 2, 4};
    int target2 = 6;
    System.out.println(new Solution().twoSum(nums2, target2).length);

    int[] nums3 = new int[]{3, 3};
    int target3 = 6;
    System.out.println(new Solution().twoSum(nums3, target3).length);
  }

}
