package leetcode.medium.rotate_image;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    new Solution().rotate(matrix1);
    System.out.println(Arrays.deepToString(matrix1));

    int[][] matrix2 = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
    new Solution().rotate(matrix2);
    System.out.println(Arrays.deepToString(matrix2));
  }

}
