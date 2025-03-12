package leetcode.medium.set_matrix_zeroes;

public class Main {

  public static void main(String[] args) {
    int[][] matrix1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    new Solution().setZeroes(matrix1);
    for (int[] rows : matrix1) {
      for (int value : rows) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
    System.out.println();

    int[][] matrix2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    new Solution().setZeroes(matrix2);
    for (int[] rows : matrix2) {
      for (int value : rows) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }

}
