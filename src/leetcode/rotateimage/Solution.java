package leetcode.rotateimage;

public class Solution {

  public void rotate(int[][] matrix) {
    int n = matrix.length;
    int[][] temp = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        temp[i][j] = matrix[n - j - 1][i];
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      System.arraycopy(temp[i], 0, matrix[i], 0, matrix[0].length);
    }
  }

}
