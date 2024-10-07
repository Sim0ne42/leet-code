package leetcode.stringtointegeratoi;

import java.math.BigInteger;

public class Solution {

  public int myAtoi(String s) {
    s = s.strip();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if ((s.charAt(i) == '+' || s.charAt(i) == '-')) {
        if (sb.length() == 0) {
          sb.append(s.charAt(i));
        } else {
          break;
        }
      } else if (Character.isDigit(s.charAt(i))) {
        sb.append(s.charAt(i));
      } else {
        break;
      }
    }

    BigInteger result = parse(sb.toString());
    if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
      return Integer.MIN_VALUE;
    }
    if (result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
      return Integer.MAX_VALUE;
    }
    return result.intValue();
  }

  private BigInteger parse(String s) {
    try {
      return new BigInteger(s);
    } catch (NumberFormatException e) {
      return BigInteger.ZERO;
    }
  }

}
