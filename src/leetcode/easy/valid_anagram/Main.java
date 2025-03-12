package leetcode.easy.valid_anagram;

public class Main {

  public static void main(String[] args) {
    var s1 = "anagram";
    var t1 = "nagaram";
    System.out.println(new Solution().isAnagram(s1, t1));

    var s2 = "rat";
    var t2 = "car";
    System.out.println(new Solution().isAnagram(s2, t2));
  }

}
