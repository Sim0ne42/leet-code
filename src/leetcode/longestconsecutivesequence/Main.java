package leetcode.longestconsecutivesequence;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = new int[]{100, 4, 200, 1, 3, 2};
    System.out.println(new Solution().longestConsecutive(nums1));
    System.out.println(new Solution().longestConsecutiveSort(nums1));
    System.out.println(new Solution().longestConsecutiveN2(nums1));
    System.out.println();

    int[] nums2 = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    System.out.println(new Solution().longestConsecutive(nums2));
    System.out.println(new Solution().longestConsecutiveSort(nums2));
    System.out.println(new Solution().longestConsecutiveN2(nums2));
    System.out.println();

    int[] nums3 = new int[]{0};
    System.out.println(new Solution().longestConsecutive(nums3));
    System.out.println(new Solution().longestConsecutiveSort(nums3));
    System.out.println(new Solution().longestConsecutiveN2(nums3));
    System.out.println();

    int[] nums4 = new int[]{};
    System.out.println(new Solution().longestConsecutive(nums4));
    System.out.println(new Solution().longestConsecutiveSort(nums4));
    System.out.println(new Solution().longestConsecutiveN2(nums4));
    System.out.println();

    int[] nums5 = new int[]{0, -1};
    System.out.println(new Solution().longestConsecutive(nums5));
    System.out.println(new Solution().longestConsecutiveSort(nums5));
    System.out.println(new Solution().longestConsecutiveN2(nums5));
    System.out.println();
  }

}
