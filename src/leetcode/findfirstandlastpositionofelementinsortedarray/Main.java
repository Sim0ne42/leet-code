package leetcode.findfirstandlastpositionofelementinsortedarray;

public class Main {

  public static void main(String[] args) {
    var actual1 = new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
    System.out.println("[" + actual1[0] + "," + actual1[1] + "]");

    var actual2 = new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 8, 10}, 8);
    System.out.println("[" + actual2[0] + "," + actual2[1] + "]");

    var actual3 = new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 8}, 8);
    System.out.println("[" + actual3[0] + "," + actual3[1] + "]");

    var actual4 = new Solution().searchRange(new int[]{8, 8, 8, 10}, 8);
    System.out.println("[" + actual4[0] + "," + actual4[1] + "]");

    var actual5 = new Solution().searchRange(new int[]{5, 7, 7, 8, 10}, 8);
    System.out.println("[" + actual5[0] + "," + actual5[1] + "]");

    var actual6 = new Solution().searchRange(new int[]{5, 7, 7, 8}, 8);
    System.out.println("[" + actual6[0] + "," + actual6[1] + "]");

    var actual7 = new Solution().searchRange(new int[]{8, 10}, 8);
    System.out.println("[" + actual7[0] + "," + actual7[1] + "]");

    var actual8 = new Solution().searchRange(new int[]{8}, 8);
    System.out.println("[" + actual8[0] + "," + actual8[1] + "]");

    var actual9 = new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
    System.out.println("[" + actual9[0] + "," + actual9[1] + "]");

    var actual10 = new Solution().searchRange(new int[]{}, 0);
    System.out.println("[" + actual10[0] + "," + actual10[1] + "]");
  }

}
