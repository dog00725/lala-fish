//输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，
//则输出"student. a am I"。 
//
// 
//
// 示例 1： 
//
// 输入: "the sky is blue"
//输出: "blue is sky the"
// 
//
// 示例 2： 
//
// 输入: "  hello world!  "
//输出: "world! hello"
//解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
// 
//
// 示例 3： 
//
// 输入: "a good   example"
//输出: "example good a"
//解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
// 
//
// 
//
// 说明： 
//
// 
// 无空格字符构成一个单词。 
// 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。 
// 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。 
// 
//
// 注意：本题与主站 151 题相同：https://leetcode-cn.com/problems/reverse-words-in-a-string/ 
//
//
// 注意：此题对比原题有改动 
//
// Related Topics 双指针 字符串 👍 256 👎 0


package leetcode.editor.cn;

/**
 * 翻转单词顺序
 * @author DY
 * @date 2023-01-16 16:35:07
 */
public class P58I_FanZhuanDanCiShunXuLcof{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P58I_FanZhuanDanCiShunXuLcof().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public String reverseWords(String s) {
//    	char[] chars = s.toCharArray();
//    	boolean preCharIsTab = false;
//    	StringBuilder stringBuilder = new StringBuilder();
//		for (int i = 0; i < chars.length; i++) {
//			if (chars[i] == ' ') {
//				preCharIsTab = true;
//				continue;
//			}
//			if (preCharIsTab) {
//				stringBuilder.append(" ");
//			}
//			stringBuilder.append(chars[i]);
//		}
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}