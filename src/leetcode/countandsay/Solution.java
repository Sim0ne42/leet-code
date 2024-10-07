package leetcode.countandsay;

public class Solution {

  public String countAndSay(int n) {
    String rle = "1";

    for (int i = 1; i < n; i++) {
      StringBuilder sb = new StringBuilder();
      int j = 0;
      while (j < rle.length()) {
        int count = 0;
        char c = rle.charAt(j);
        while (j < rle.length() && rle.charAt(j) == c) {
          count++;
          j++;
        }
        sb.append(count).append(c);
      }
      rle = sb.toString();
    }

    return rle;
  }

}
