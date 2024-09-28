package leetcode.romantointeger;

public class Main {

  public static void main(String[] args) {
    var s1 = "III";
    System.out.println(new Solution().romanToInt(s1));

    var s2 = "IV";
    System.out.println(new Solution().romanToInt(s2));

    var s3 = "IX";
    System.out.println(new Solution().romanToInt(s3));

    var s4 = "LVIII";
    System.out.println(new Solution().romanToInt(s4));

    var s5 = "MCMXCIV";
    System.out.println(new Solution().romanToInt(s5));
  }

}
