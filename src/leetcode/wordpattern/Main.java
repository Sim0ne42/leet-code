package leetcode.wordpattern;

public class Main {

  public static void main(String[] args) {
    System.out.println(new Solution().wordPattern("abba", "dog cat cat dog"));
    System.out.println(new Solution().wordPattern("abba", "dog cat cat fish"));
    System.out.println(new Solution().wordPattern("aaaa", "dog cat cat dog"));
    System.out.println(new Solution().wordPattern("abba", "dog dog dog dog"));
  }

}
