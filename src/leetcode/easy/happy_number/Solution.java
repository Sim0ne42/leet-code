package leetcode.easy.happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public boolean isHappy(int n) {
    Set<Integer> seen = new HashSet<>();
    int sum = 0;

    while (sum != 1) {
      String value = String.valueOf(n);
      sum = 0;
      for (int i = 0; i < value.length(); i++) {
        int x = Integer.parseInt(String.valueOf(value.toCharArray()[i]));
        sum += x * x;
      }
      n = sum;
      if (seen.contains(n)) {
        return false;
      }
      seen.add(n);
    }

    return true;
  }

}
