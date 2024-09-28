package leetcode.convertsortedarraytobinarysearchtree;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{-10, -3, 0, 5, 9};
    System.out.println(new Solution().sortedArrayToBST(nums1));

    int[] nums2 = new int[]{1, 3};
    System.out.println(new Solution().sortedArrayToBST(nums2));

    int[] nums3 = new int[]{0, 1, 2, 3, 4, 5};
    System.out.println(new Solution().sortedArrayToBST(nums3));

  }

}
