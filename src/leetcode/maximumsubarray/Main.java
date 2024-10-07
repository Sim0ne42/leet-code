package leetcode.maximumsubarray;

public class Main {

  public static void main(String[] args) {
    System.out.println(new Solution().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    System.out.println(new Solution().maxSubArray(new int[]{1}));
    System.out.println(new Solution().maxSubArray(new int[]{5, 4, -1, 7, 8}));
    System.out.println(new Solution().maxSubArray(new int[]{-1}));
  }

}
