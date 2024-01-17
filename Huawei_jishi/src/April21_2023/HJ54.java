package April21_2023;
import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class HJ54 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(hj54(input));
    }

    //中缀表达式转后缀表达式
    public static Deque<String> Mid2End(String str) {
        //用于存运算数
        StringBuilder number = new StringBuilder();
        //后缀表达式
        Deque<String> deque = new LinkedList<>();
        //运算操作符
        Stack<Character> stack = new Stack<>();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                number.append(c);
            } else {
                if (number.length() > 0) {
                    if (flag) {
                        deque.add("-" + number.toString());
                        flag = false;
                    } else {
                        deque.add(number.toString());
                    }
                    number.delete(0, number.length());
                }
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    char top = stack.peek();
                    while (top != '(') {
                        deque.add(stack.pop() + "");
                        top = stack.peek();
                    }
                    stack.pop();
                } else if (c == '-' && (i == 0 || str.charAt(i - 1) == '(')) {
                    // 用于处理运算数是负数的情况 比如：-1*(-1-1) => -1 -1 1 - *
                    flag = true;
                } else  {
                    if (stack.size() <= 0 || stack.peek() == '(' || opeCompare(c, stack.peek())) {
                        stack.push(c);
                    } else {
                        while (!stack.isEmpty() && stack.peek() != '(' &&
                                !opeCompare(c, stack.peek())) {
                            deque.add(stack.pop() + "");
                        }
                        stack.push(c);
                    }
                }
            }
        }
        if (number.length() > 0) {
            deque.add(number.toString());
        }
        while (!stack.isEmpty()) {
            deque.add(stack.pop() + "");
        }

        return deque;
    }

    //运算符优先级比较
    public static  boolean opeCompare(char a, char b) {
        if (a == '*' || a == '/') {
            return b == '+' || b == '-';
        }
        return false;
    }

    //后缀表达式计算
    public static int hj54(String str) {
        Deque<String> deque = Mid2End(str);
        Stack<Integer> stack = new Stack<>();
        while (deque.size() > 0) {
            String s = deque.pollFirst();
            if (s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9') {
                stack.push(Integer.parseInt(s));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int r = 0;
                switch (s.charAt(0)) {
                    case '*':
                        r = a * b;
                        break;
                    case '/':
                        r = a / b;
                        break;
                    case '+':
                        r = a + b;
                        break;
                    case '-':
                        r = a - b;
                        break;
                    default:
                }
                stack.push(r);
            }
        }
        return stack.pop();
    }
}
