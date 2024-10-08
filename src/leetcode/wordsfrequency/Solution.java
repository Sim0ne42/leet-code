package leetcode.wordsfrequency;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public Map<String, Integer> wordsFrequency(String sentence) {
    sentence = sentence.toLowerCase();
    Map<String, Integer> occurrences = new HashMap<>();
    for (String s : sentence.split("[ \\,\\;\\.\\!\\?]+")) {
      occurrences.put(s, occurrences.getOrDefault(s, 0) + 1);
    }
    return occurrences;
  }

}
