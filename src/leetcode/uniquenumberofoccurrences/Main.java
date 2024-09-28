package leetcode.uniquenumberofoccurrences;

public class Main {

  public static void main(String[] args) {
    int[] arr1 = new int[]{1, 2, 2, 1, 1, 3};
    System.out.println(new Solution().uniqueOccurrences(arr1));

    int[] arr2 = new int[]{1, 2};
    System.out.println(new Solution().uniqueOccurrences(arr2));

    int[] arr3 = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
    System.out.println(new Solution().uniqueOccurrences(arr3));
  }

}
