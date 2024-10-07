package leetcode.binarysearch;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{-1, 0, 3, 5, 9, 12};
    int target1 = 9;
    System.out.println(new Solution().search(nums1, target1));

    int[] nums2 = new int[]{-1, 0, 3, 5, 9, 12};
    int target2 = 2;
    System.out.println(new Solution().search(nums2, target2));
  }

}
