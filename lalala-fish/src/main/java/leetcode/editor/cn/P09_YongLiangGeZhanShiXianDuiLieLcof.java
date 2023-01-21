//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的
//功能。(若队列中没有元素，deleteHead 操作返回 -1 ) 
//
// 
//
// 示例 1： 
//
// 
//输入：
//["CQueue","appendTail","deleteHead","deleteHead","deleteHead"]
//[[],[3],[],[],[]]
//输出：[null,null,3,-1,-1]
// 
//
// 示例 2： 
//
// 
//输入：
//["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
//[[],[],[5],[2],[],[]]
//输出：[null,-1,null,null,5,2]
// 
//
// 提示： 
//
// 
// 1 <= values <= 10000 
// 最多会对 appendTail、deleteHead 进行 10000 次调用 
// 
//
// Related Topics 栈 设计 队列 👍 661 👎 0


package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 用两个栈实现队列
 * @author DY
 * @date 2023-01-10 11:47:12
 */
public class P09_YongLiangGeZhanShiXianDuiLieLcof{
//	 public static void main(String[] args) {
	 	 //测试代码
//	 	 Solution solution = new P09_YongLiangGeZhanShiXianDuiLieLcof().new Solution();
//	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class CQueue {

    Deque<Integer> firstStack;
    Deque<Integer> secondStack;

    public CQueue() {
        firstStack = new ArrayDeque<Integer>();
        secondStack = new ArrayDeque<Integer>();
    }
    
    public void appendTail(int value) {
        firstStack.push(value);
    }
    
    public int deleteHead() {
        if (!secondStack.isEmpty()) {
            return secondStack.pop();
        }
        if (firstStack.isEmpty()) {
            return -1;
        }
        while (!firstStack.isEmpty()) {
            Integer value = firstStack.pop();
            secondStack.push(value);
        }
        return secondStack.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)

}