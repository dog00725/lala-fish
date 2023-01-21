//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
//
// Related Topics 栈 递归 链表 双指针 👍 364 👎 0


package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 从尾到头打印链表
 * @author DY
 * @date 2023-01-16 11:34:54
 */
public class P06_CongWeiDaoTouDaYinLianBiaoLcof{
//	 public static void main(String[] args) {
//	 	 //测试代码
//	 	 Solution solution = new P剑指 Offer 06_CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
//	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
		Deque<Integer> deque = new ArrayDeque<>();
		while (head.next != null) {
			deque.push(head.val);
			head = head.next;
		}
		int[] value = new int[deque.size()];
		for (int i = 0; i < value.length; i++) {
			value[i] = deque.pop();
		}
		return value;
    }


    int[] res;
    int i = 0;
    int j = 0;
    //递归解法
	//关机初始化数组
    public int[] reversePrint_recurrence(ListNode head) {
    	solve(head);
    	return res;
    }

    private void solve(ListNode head) {
    	if (head == null) {
    		res = new int[i];
		}
    	i++;
    	solve(head.next);
    	res[j] = head.val;
    	j++;
	}
}

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
//leetcode submit region end(Prohibit modification and deletion)

}