package leetcode.easy.word_pattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

  public boolean wordPattern(String pattern, String s) {
    List<String> strings = Arrays.stream(s.split(" ")).collect(Collectors.toList());
    if (pattern.length() != strings.size()) {
      return false;
    }

    Map<Character, String> charToStringMap = new HashMap<>();
    for (int i = 0; i < pattern.length(); i++) {
      char character = pattern.charAt(i);
      String string = strings.get(i);
      if ((charToStringMap.containsKey(character) && !charToStringMap.get(character).equals(string))
          || (!charToStringMap.containsKey(character) && charToStringMap.containsValue(string))) {
        return false;
      }
      charToStringMap.putIfAbsent(character, string);
    }

    return true;
  }

}
