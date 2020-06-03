

/**
 * leetcode 题目：有效的括号（即括号要匹配）
 *              例如：传入字符串“{（）}” 返回true  传入”（}{}）“ 返回fasle
 * 使用数据结构：栈
 */
public class Solution {
    public boolean isValid(String s) {
        ArrayStack<Character> stack = new ArrayStack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(')
                stack.push(c);
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (topChar != '(' && c == ')')
                    return false;
                if (topChar != '{' && c == '}')
                    return false;
                if (topChar != '[' && c == ']')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({})";
        System.out.println(new Solution().isValid(s));
    }
}