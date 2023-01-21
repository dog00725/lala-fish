//定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。 
//
// 
//
// 示例: 
//
// MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.min();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.min();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// 各函数的调用总次数不超过 20000 次 
// 
//
// 
//
// 注意：本题与主站 155 题相同：https://leetcode-cn.com/problems/min-stack/ 
//
// Related Topics 栈 设计 👍 429 👎 0


package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 包含min函数的栈
 * @author DY
 * @date 2023-01-11 16:53:49
 */
public class P30_BaoHanMinhanShuDeZhanLcof{
	 public static void main(String[] args) {
	 	 //测试代码
//	 	 Solution solution = new P剑指 Offer 30_BaoHanMinhanShuDeZhanLcof().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {

	     Deque<Integer> stack;
	     Deque<Integer> stackHelper;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new ArrayDeque<>();
        stackHelper = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
        if (stackHelper.isEmpty()) {
            stackHelper.push(x);
            return;
        }
        if (x < stackHelper.peek()) {
            stackHelper.push(x);
            return;
        }
    }

    public void pop() {
        Integer value = stack.pop();
        if (value.equals(stackHelper.peek())) {
            stackHelper.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackHelper.peek();
    }


}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
//leetcode submit region end(Prohibit modification and deletion)

}