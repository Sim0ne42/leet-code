package leetcode.medium.evaluate_reverse_polish_notation;

public class Main {

  public static void main(String[] args) {
    var tokens1 = new String[]{"2", "1", "+", "3", "*"};
    System.out.println(new Solution().evalRPN(tokens1));

    var tokens2 = new String[]{"4", "13", "5", "/", "+"};
    System.out.println(new Solution().evalRPN(tokens2));

    var tokens3 = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
    System.out.println(new Solution().evalRPN(tokens3));
  }

}
