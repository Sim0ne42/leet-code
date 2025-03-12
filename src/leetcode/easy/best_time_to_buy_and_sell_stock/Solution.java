package leetcode.easy.best_time_to_buy_and_sell_stock;

public class Solution {

  public int maxProfit(int[] prices) {
    int i = 0;
    int j = 1;
    int maxProfit = 0;

    while (j < prices.length) {
      int profit = prices[j] - prices[i];
      if (profit > maxProfit) {
        maxProfit = profit;
      }
      if (profit < 0) {
        i++;
        j = i + 1;
      } else {
        j++;
      }
    }

    return maxProfit;
  }

}
