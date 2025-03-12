package leetcode.easy.majority_element;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{3, 2, 3};
    System.out.println(new Solution().majorityElement(nums1));

    int[] nums2 = new int[]{2, 2, 1, 1, 1, 2, 2};
    System.out.println(new Solution().majorityElement(nums2));
  }

}
