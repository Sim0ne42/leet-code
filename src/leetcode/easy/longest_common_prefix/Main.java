package leetcode.easy.longest_common_prefix;

public class Main {

  public static void main(String[] args) {
    String[] strs1 = new String[]{"flower", "flow", "flight"};
    System.out.println(new Solution().longestCommonPrefix(strs1));

    String[] strs2 = new String[]{"dog", "racecar", "car"};
    System.out.println(new Solution().longestCommonPrefix(strs2));

    String[] strs3 = new String[]{"cir", "car"};
    System.out.println(new Solution().longestCommonPrefix(strs3));
  }

}
