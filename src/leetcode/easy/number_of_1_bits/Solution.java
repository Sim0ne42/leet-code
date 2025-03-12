package leetcode.easy.number_of_1_bits;

public class Solution {

  public int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
      count += n & 1;
      n >>>= 1;
    }
    return count;
  }

}
