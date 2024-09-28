package leetcode.convertsortedarraytobinarysearchtree;

public class Solution {

  public TreeNode sortedArrayToBST(int[] nums) {
    return addNodeToTree(nums, 0, nums.length - 1);
  }

  private TreeNode addNodeToTree(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }
    if (start == end) {
      return new TreeNode(nums[start]);
    }

    int middle = (start + end) / 2;
    var node = new TreeNode(nums[middle]);

    node.left = addNodeToTree(nums, start, middle - 1);
    node.right = addNodeToTree(nums, middle + 1, end);
    return node;
  }

}
