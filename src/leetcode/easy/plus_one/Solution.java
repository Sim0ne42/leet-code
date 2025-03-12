package leetcode.easy.plus_one;

import java.util.Arrays;

public class Solution {

  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] != 9) {
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }

    int[] result = new int[digits.length + 1];
    result[0] = 1;

    return result;
  }

  public int[] plusOneWithCarry(int[] digits) {
    int[] result = Arrays.stream(digits).allMatch(i -> i == 9)
        ? new int[digits.length + 1]
        : new int[digits.length];

    int carry = 1;
    for (int i = digits.length - 1; i >= 0; i--) {
      int sum = digits[i] + carry;
      carry = sum / 10;
      result[i] = sum % 10;
    }
    if (carry == 1) {
      result[0] = 1;
    }

    return result;
  }

}
