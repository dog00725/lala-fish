//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
//
// Related Topics 递归 链表 👍 523 👎 0


package leetcode.editor.cn;

/**
 * 反转链表
 * @author DY
 * @date 2023-01-16 14:39:19
 */
public class P24_FanZhuanLianBiaoLcof{
	 public static void main(String[] args) {

	 	 //测试代码
	 	 Solution solution = new P24_FanZhuanLianBiaoLcof().new Solution();
		 ListNode n1 = new ListNode(1);
		 ListNode n2 = new ListNode(2);
		 ListNode n3 = new ListNode(3);
		 ListNode n4 = new ListNode(4);
		 ListNode n5 = new ListNode(5);

		 n1.next = n2;
		 n2.next = n3;
		 n3.next = n4;
		 n4.next = n5;

		 solution.reverseList_doublePoint(null);
	 }
	 
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

	//双指针
	public ListNode reverseList_doublePoint(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		return pre;
	}

	//递归算法
    public ListNode reverseList(ListNode head) {
    	solve(head);
    	return newHead;
    }

    ListNode newHead;

    private ListNode solve(ListNode node) {
    	if (node.next == null) {
    		newHead = new ListNode(node.val);
    		return newHead;
		}
		ListNode preNodeVal = solve(node.next);
		preNodeVal.next = new ListNode(node.val);
		return preNodeVal.next;
	}
}

//leetcode submit region end(Prohibit modification and deletion)

}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}