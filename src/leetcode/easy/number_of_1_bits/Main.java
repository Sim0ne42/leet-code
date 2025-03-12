package leetcode.easy.number_of_1_bits;

public class Main {

  public static void main(String[] args) {
    int n1 = 11;
    System.out.println(new Solution().hammingWeight(n1));

    int n2 = 128;
    System.out.println(new Solution().hammingWeight(n2));

    int n3 = 2147483645;
    System.out.println(new Solution().hammingWeight(n3));
  }

}
