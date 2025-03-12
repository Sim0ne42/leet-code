package leetcode.medium.evaluate_reverse_polish_notation;

import java.util.LinkedList;

public class Solution {

  public int evalRPN(String[] tokens) {
    LinkedList<Integer> stack = new LinkedList<>();

    for (String token : tokens) {
      if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
        int operand2 = stack.pop();
        int operand1 = stack.pop();
        switch (token) {
          case "+":
            stack.push(operand1 + operand2);
            break;
          case "-":
            stack.push(operand1 - operand2);
            break;
          case "*":
            stack.push(operand1 * operand2);
            break;
          case "/":
            stack.push(operand1 / operand2);
            break;
        }
      } else {
        stack.push(Integer.parseInt(token));
      }
    }

    return stack.pop();
  }

}
