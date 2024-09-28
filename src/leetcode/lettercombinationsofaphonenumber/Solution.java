package leetcode.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

  private final Map<Integer, String> map = Map.of(
      2, "abc",
      3, "def",
      4, "ghi",
      5, "jkl",
      6, "mno",
      7, "pqrs",
      8, "tuv",
      9, "wxyz"
  );

  public List<String> letterCombinations(String digits) {
    if (digits == null || digits.isEmpty()) {
      return List.of();
    }

    if (digits.length() == 1) {
      return Arrays.stream(map.get(Integer.valueOf(digits)).split(""))
          .collect(Collectors.toList());
    }

    var digitList = Arrays.stream(digits.split(""))
        .mapToInt(Integer::parseInt)
        .boxed()
        .collect(Collectors.toList());

    var values = digitList.stream()
        .map(map::get)
        .collect(Collectors.toList());

    var chars = values.stream()
        .map(it -> Arrays.stream(it.split("")).collect(Collectors.toList()))
        .collect(Collectors.toList());
    System.out.println(chars);

    int numberOfBuilders = chars.stream()
        .map(List::size)
        .reduce((a, b) -> a * b)
        .orElse(0);

    var builders = new ArrayList<StringBuilder>(numberOfBuilders);
    for (int i = 0; i < numberOfBuilders; i++) {
      builders.add(new StringBuilder());
    }

    return builders.stream()
        .map(StringBuilder::toString)
        .collect(Collectors.toList());
  }

}
