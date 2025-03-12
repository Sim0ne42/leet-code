package leetcode.medium.add_two_numbers;

import java.math.BigInteger;

class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    var firstNum = new StringBuilder();
    var secondNum = new StringBuilder();

    while (l1 != null) {
      firstNum.append(l1.val);
      l1 = l1.next;
    }
    while (l2 != null) {
      secondNum.append(l2.val);
      l2 = l2.next;
    }

    var result = new BigInteger(firstNum.reverse().toString())
        .add(new BigInteger(secondNum.reverse().toString()));
    var resultString = String.valueOf(result);

    var resultList = new ListNode[resultString.length()];
    for (int i = 0; i < resultString.length(); i++) {
      var value = new BigInteger(String.valueOf(resultString.charAt(i))).intValue();
      if (i == 0) {
        resultList[i] = new ListNode(value);
      } else {
        resultList[i] = new ListNode(value, resultList[i - 1]);
      }
    }

    return resultList[resultList.length - 1];
  }

}
