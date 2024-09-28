package leetcode.findthetownjudge;

public class Main {

  public static void main(String[] args) {
    int n1 = 2;
    int[][] trust1 = new int[][]{new int[]{1, 2}};
    System.out.println(new Solution().findJudge(n1, trust1));

    int n2 = 3;
    int[][] trust2 = new int[][]{new int[]{1, 3}, {2, 3}};
    System.out.println(new Solution().findJudge(n2, trust2));

    int n3 = 3;
    int[][] trust3 = new int[][]{new int[]{1, 3}, {2, 3}, {3, 1}};
    System.out.println(new Solution().findJudge(n3, trust3));
  }

}
