package leetcode.medium.letter_combinations_of_a_phone_number;

public class Main {

  public static void main(String[] args) {
    var s1 = "23";
    System.out.println(new Solution().letterCombinations(s1));

    var s2 = "";
    System.out.println(new Solution().letterCombinations(s2));

    var s3 = "2";
    System.out.println(new Solution().letterCombinations(s3));

    var s4 = "234";
    System.out.println(new Solution().letterCombinations(s4));
  }

}
