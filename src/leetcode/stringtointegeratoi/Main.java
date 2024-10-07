package leetcode.stringtointegeratoi;

public class Main {

  public static void main(String[] args) {
    System.out.println(new Solution().myAtoi("42"));
    System.out.println(new Solution().myAtoi("-042"));
    System.out.println(new Solution().myAtoi("1337c0d3"));
    System.out.println(new Solution().myAtoi("0-1"));
    System.out.println(new Solution().myAtoi("words and 987"));
    System.out.println(new Solution().myAtoi("20000000000000000000"));
  }

}
