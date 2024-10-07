package leetcode.setmatrixzeroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public void setZeroes(int[][] matrix) {
    List<int[]> zeros = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          zeros.add(new int[]{i, j});
        }
      }
    }

    for (int[] zero : zeros) {
      int row = zero[0];
      int column = zero[1];
      Arrays.fill(matrix[row], 0);
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][column] = 0;
      }
    }
  }

}
