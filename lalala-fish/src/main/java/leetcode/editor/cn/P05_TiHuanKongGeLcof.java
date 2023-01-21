//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
//
// Related Topics 字符串 👍 397 👎 0


package leetcode.editor.cn;

/**
 * 替换空格
 * @author DY
 * @date 2023-01-16 16:26:49
 */
public class P05_TiHuanKongGeLcof{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P05_TiHuanKongGeLcof().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
    	if (s.length() <= 0) {
    		return s;
		}
    	StringBuilder stringBuilder = new StringBuilder();
    	char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if ((chars[i]) == ' ') {
				stringBuilder.append("%20");
				continue;
			}
			stringBuilder.append(chars[i]);
		}
		return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}