package leetcode.searchinsertposition;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 3, 5, 6};
    int target1 = 5;
    System.out.println(new Solution().searchInsert(nums1, target1));

    int[] nums2 = new int[]{1, 3, 5, 6};
    int target2 = 2;
    System.out.println(new Solution().searchInsert(nums2, target2));

    int[] nums3 = new int[]{1, 3, 5, 6};
    int target3 = 7;
    System.out.println(new Solution().searchInsert(nums3, target3));

    int[] nums4 = new int[]{1, 3};
    int target4 = 2;
    System.out.println(new Solution().searchInsert(nums4, target4));

    int[] nums5 = new int[]{2};
    int target5 = 3;
    System.out.println(new Solution().searchInsert(nums5, target5));

    int[] nums6 = new int[]{2};
    int target6 = 1;
    System.out.println(new Solution().searchInsert(nums6, target6));

    int[] nums7 = new int[0];
    int target7 = 2;
    System.out.println(new Solution().searchInsert(nums7, target7));
  }

}
