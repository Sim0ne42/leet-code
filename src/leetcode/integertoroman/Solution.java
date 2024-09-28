package leetcode.integertoroman;

public class Solution {

  private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
  private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

  public String intToRoman(int num) {
    var result = new StringBuilder();

    for (int i = 0; i < VALUES.length; i++) {
      if (num <= 0) {
        break;
      } else {
        while (num >= VALUES[i]) {
          num -= VALUES[i];
          result.append(SYMBOLS[i]);
        }
      }
    }

    return result.toString();
  }

}
