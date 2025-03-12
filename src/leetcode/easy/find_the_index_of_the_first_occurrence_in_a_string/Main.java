package leetcode.easy.find_the_index_of_the_first_occurrence_in_a_string;

public class Main {

  public static void main(String[] args) {
    var haystack1 = "sadbutsad";
    var needle1 = "sad";
    System.out.println(new Solution().strStr(haystack1, needle1));

    var haystack2 = "leetcode";
    var needle2 = "leeto";
    System.out.println(new Solution().strStr(haystack2, needle2));

    var haystack3 = "aaa";
    var needle3 = "aaaa";
    System.out.println(new Solution().strStr(haystack3, needle3));

    var haystack4 = "mississippi";
    var needle4 = "issipi";
    System.out.println(new Solution().strStr(haystack4, needle4));
  }

}
