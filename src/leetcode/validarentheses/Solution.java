package leetcode.validarentheses;

import java.util.LinkedList;

public class Solution {

  public boolean isValid(String s) {
    var stack = new LinkedList<Character>();

    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        var openingBracket = stack.poll();
        if (openingBracket == null
            || openingBracket == '(' && c != ')'
            || openingBracket == '[' && c != ']'
            || openingBracket == '{' && c != '}') {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

}
