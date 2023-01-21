//请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指
//向链表中的任意节点或者 null。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
//输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
// 
//
// 示例 2： 
//
// 
//
// 输入：head = [[1,1],[2,1]]
//输出：[[1,1],[2,1]]
// 
//
// 示例 3： 
//
// 
//
// 输入：head = [[3,null],[3,0],[3,null]]
//输出：[[3,null],[3,0],[3,null]]
// 
//
// 示例 4： 
//
// 输入：head = []
//输出：[]
//解释：给定的链表为空（空指针），因此返回 null。
// 
//
// 
//
// 提示： 
//
// 
// -10000 <= Node.val <= 10000 
// Node.random 为空（null）或指向链表中的节点。 
// 节点数目不超过 1000 。 
// 
//
// 
//
// 注意：本题与主站 138 题相同：https://leetcode-cn.com/problems/copy-list-with-random-
//pointer/ 
//
// 
//
// Related Topics 哈希表 链表 👍 641 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 复杂链表的复制
 * @author DY
 * @date 2023-01-16 15:09:56
 */
public class P35_FuZaLianBiaoDeFuZhiLcof{
//	 public static void main(String[] args) {
//	 	 //测试代码
//	 	 Solution solution = new P35_FuZaLianBiaoDeFuZhiLcof().new Solution();
//	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {

	/**
	 * 关键在于确定random节点
	 * 1.利用hash表 简历新老节点直接的连接
	 * 2.将新老两个链表  按照  老-》新-》老-》新  的方式组合成一个列表，以此来确定random节点
	 */

	Map<Node,Node> nodeMap = new HashMap();

    public Node copyRandomList(Node head) {
        if (head == null) {
        	return null;
		}
        Node cur = head;
        while (cur != null) {
        	nodeMap.put(cur,new Node(cur.val));
        	cur = cur.next;
		}


        cur = head;
        while (cur != null) {
        	Node newNode = nodeMap.get(cur);
        	Node originalNext = cur.next;
        	Node originalRandom = cur.random;
        	newNode.next = nodeMap.get(originalNext);
        	newNode.random = nodeMap.get(originalRandom);
        	cur = cur.next;
		}
        return nodeMap.get(head);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}