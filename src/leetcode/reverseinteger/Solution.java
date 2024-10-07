package leetcode.reverseinteger;

public class Solution {

  public int reverse(int x) {
    StringBuilder sb = new StringBuilder();
    if (x < 0) {
      sb.append('-');
    }
    if (x == 0) {
      return 0;
    }
    while (x != 0) {
      sb.append(Math.abs(x % 10));
      x /= 10;
    }
    long result = Long.parseLong(sb.toString());
    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
      return 0;
    }
    return (int) result;
  }

}
