package leetcode.medium.container_with_most_water;

public class Main {

  public static void main(String[] args) {
    int[] height1 = {1, 8, 6, 2, 5, 5, 8, 3, 7};
    System.out.println(new Solution().maxArea(height1));

    int[] height2 = {1, 1};
    System.out.println(new Solution().maxArea(height2));
  }

}
