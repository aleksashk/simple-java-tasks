package by.aleksandrphilimonov.task2;

import java.util.Stack;

public class Starter {
    public static void main(String[] args) {
        String str = "15 - 8 * 4 + 10";
        System.out.println(calculate(str));
    }

    public static int calculate(String str) {
        int curNum = 0;
        char op = '+';
        int length = str.length();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                curNum = (curNum * 10) + (ch - '0');
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == length - 1) {
                if (op == '+') {
                    stack.push(curNum);
                } else if (op == '-') {
                    stack.push(-curNum);
                } else if (op == '*') {
                    stack.push(stack.pop() * curNum);
                } else if (op == '/') {
                    stack.push(stack.pop() / curNum);
                }
                curNum = 0;
                op = ch;
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
