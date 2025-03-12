package leetcode.easy.pascals_triangle;

public class Main {

  public static void main(String[] args) {
    int numRows1 = 5;
    System.out.println(new Solution().generate(numRows1));

    int numRows2 = 1;
    System.out.println(new Solution().generate(numRows2));

    int numRows3 = 30;
    System.out.println(new Solution().generate(numRows3));
  }

}
