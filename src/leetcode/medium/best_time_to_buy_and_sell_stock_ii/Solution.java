package leetcode.medium.best_time_to_buy_and_sell_stock_ii;

public class Solution {

  public int maxProfit(int[] prices) {
    int total = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i] < prices[i + 1]) {
        total += prices[i + 1] - prices[i];
      }
    }
    return total;
  }

}
