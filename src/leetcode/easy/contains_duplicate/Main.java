package leetcode.easy.contains_duplicate;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 3, 1};
    System.out.println(new Solution().containsDuplicate(nums1));

    int[] nums2 = new int[]{1, 2, 3, 4};
    System.out.println(new Solution().containsDuplicate(nums2));

    int[] nums3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    System.out.println(new Solution().containsDuplicate(nums3));
  }

}
