import java.util.Stack;

public class NowCoder_JZ31 {
    /**
     * 输入两个整数序列，第一个序列表示栈的压入顺序，
     * 请判断第二个序列是否可能为该栈的弹出顺序。
     * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
     * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
     *
     * @param pushV
     * @param popV
     * @return
     */
    public boolean IsPopOrder(int[] pushV, int[] popV) {
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushV.length; i++) {
            stack.push(pushV[i]);

            while (!stack.empty() && stack.peek() == popV[j] && j < popV.length) {
                stack.pop();
                j++;


            }
        }
        return stack.empty();
    }
}
