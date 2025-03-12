package leetcode.easy.excel_sheet_column_number;

public class Main {

  public static void main(String[] args) {
    String columnTitle1 = "A";
    System.out.println(new Solution().titleToNumber(columnTitle1));

    String columnTitle2 = "AB";
    System.out.println(new Solution().titleToNumber(columnTitle2));

    String columnTitle3 = "ZY";
    System.out.println(new Solution().titleToNumber(columnTitle3));
  }

}
