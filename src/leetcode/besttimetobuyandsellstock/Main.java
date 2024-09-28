package leetcode.besttimetobuyandsellstock;

public class Main {

  public static void main(String[] args) {
    int[] prices1 = new int[]{7, 1, 5, 3, 6, 4};
    System.out.println(new Solution().maxProfit(prices1));

    int[] prices2 = new int[]{7, 6, 4, 3, 1};
    System.out.println(new Solution().maxProfit(prices2));

    int[] prices3 = new int[]{2, 1, 2, 1, 0, 1, 2};
    System.out.println(new Solution().maxProfit(prices3));

    int[] prices4 = new int[]{7, 6, 5, 4, 3, 2, 1};
    System.out.println(new Solution().maxProfit(prices4));
  }

}
