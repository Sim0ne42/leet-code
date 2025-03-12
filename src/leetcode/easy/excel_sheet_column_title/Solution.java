package leetcode.easy.excel_sheet_column_title;

public class Solution {

  public String convertToTitle(int columnNumber) {
    StringBuilder builder = new StringBuilder();
    while (columnNumber > 0) {
      int modulo = (columnNumber - 1) % 26;
      builder.append(modulo == 0 ? 'A' : (char) ('A' + modulo));
      columnNumber -= modulo + 1;
      columnNumber /= 26;
    }
    return builder.reverse().toString();
  }

}
