package leetcode.plusone;

public class Main {

  public static void main(String[] args) {
    int[] digits1 = new int[]{1, 2, 3};
    System.out.println(new Solution().plusOne(digits1));
    System.out.println(new Solution().plusOneWithCarry(digits1));

    int[] digits2 = new int[]{4, 3, 2, 1};
    System.out.println(new Solution().plusOne(digits2));
    System.out.println(new Solution().plusOneWithCarry(digits2));

    int[] digits3 = new int[]{9};
    System.out.println(new Solution().plusOne(digits3));
    System.out.println(new Solution().plusOneWithCarry(digits3));

    int[] digits4 = new int[]{8, 9, 9, 9};
    System.out.println(new Solution().plusOne(digits4));
    System.out.println(new Solution().plusOneWithCarry(digits4));

    int[] digits5 = new int[]{9, 8, 9};
    System.out.println(new Solution().plusOne(digits5));
    System.out.println(new Solution().plusOneWithCarry(digits5));
  }

}
