package leetcode.medium.container_with_most_water;

public class Solution {

  public int maxArea(int[] height) {
    var maxArea = 0;
    var i = 0;
    var j = height.length - 1;

    while (i < j) {
      var area = Math.min(height[i], height[j]) * (j - i);
      maxArea = Math.max(maxArea, area);
      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }

    return maxArea;
  }

}
