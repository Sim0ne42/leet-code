package leetcode.easy.remove_duplicates_from_sorted_array;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.println(new Solution().removeDuplicates(nums1));

    int[] nums2 = new int[]{1, 1, 2};
    System.out.println(new Solution().removeDuplicates(nums2));

    int[] nums3 = new int[]{1, 1};
    System.out.println(new Solution().removeDuplicates(nums3));

    int[] nums4 = new int[]{1, 1, 2, 3};
    System.out.println(new Solution().removeDuplicates(nums4));
  }

}
