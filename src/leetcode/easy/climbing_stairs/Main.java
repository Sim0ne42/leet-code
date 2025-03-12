package leetcode.easy.climbing_stairs;

public class Main {

  public static void main(String[] args) {
    int n1 = 2;
    System.out.println("result rec: " + new Solution().climbStairsRec(n1));
    System.out.println("result: " + new Solution().climbStairs(n1));

    int n2 = 3;
    System.out.println("result rec: " + new Solution().climbStairsRec(n2));
    System.out.println("result: " + new Solution().climbStairs(n2));
  }

}
