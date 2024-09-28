package leetcode.lengthoflastword;

public class Main {

  public static void main(String[] args) {
    String s1 = "Hello World";
    System.out.println(new Solution().lengthOfLastWord(s1));

    String s2 = "   fly me   to   the moon  ";
    System.out.println(new Solution().lengthOfLastWord(s2));

    String s3 = "luffy is still joyboy";
    System.out.println(new Solution().lengthOfLastWord(s3));
  }

}
