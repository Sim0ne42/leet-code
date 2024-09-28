package leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = initialize(numRows);

    for (int i = 2; i < numRows; i++) {
      List<Integer> row = result.get(i);
      List<Integer> previousRow = result.get(i - 1);
      for (int j = 1; j < row.size() - 1; j++) {
        row.set(j, previousRow.get(j - 1) + previousRow.get(j));
      }
    }

    return result;
  }

  private List<List<Integer>> initialize(int numRows) {
    List<List<Integer>> result = new ArrayList<>(numRows);

    for (int i = 0; i < numRows; i++) {
      List<Integer> row = new ArrayList<>(i);
      for (int j = 0; j <= i; j++) {
        row.add(j, 1);
      }
      if (!row.isEmpty()) {
        result.add(row);
      }
    }

    return result;
  }

}
