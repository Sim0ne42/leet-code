package leetcode.searchinrotatedsortedarray;

public class Main {

  public static void main(String[] args) {
    System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));
    System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2));
    System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
    System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    System.out.println(new Solution().search(new int[]{1}, 0));
  }

}
