package leetcode.easy.first_unique_character_in_a_string;

public class Main {

  public static void main(String[] args) {
    String s1 = "leetcode";
    System.out.println(new Solution().firstUniqChar(s1));

    String s2 = "loveleetcode";
    System.out.println(new Solution().firstUniqChar(s2));

    String s3 = "aabb";
    System.out.println(new Solution().firstUniqChar(s3));
  }

}
