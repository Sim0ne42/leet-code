package leetcode.lengthoflongestsubstring;

public class Main {

  public static void main(String[] args) {
    var s1 = "abcabcbb";
    System.out.println("result: " + new Solution().lengthOfLongestSubstring(s1));

    var s2 = "bbbbb";
    System.out.println("result: " + new Solution().lengthOfLongestSubstring(s2));

    var s3 = "pwwkew";
    System.out.println("result: " + new Solution().lengthOfLongestSubstring(s3));

    var s4 = "aab";
    System.out.println("result: " + new Solution().lengthOfLongestSubstring(s4));
  }

}
