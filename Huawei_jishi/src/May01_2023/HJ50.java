package May01_2023;

import java.io.*;

public class HJ50 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        System.out.println(new ExprDemo().expr(in));
    }

    public static class ExprDemo {
        public char lastsign1 = 0, lastsign2 = 0;
        public int temp1 = 0, temp2 = 0;
        private static final char TEMPCHAR = 0;

        public int expr(InputStream in) throws IOException {
            int result = 0;
            char c;
            a:
            while ((c = (char) in.read()) != '\n') {
                switch (c) {
                    case ')':
                    case ']':
                    case '}':
                        break a;
                    case '(':
                    case '[':
                    case '{':
                        temp2 = new ExprDemo().expr(in);
                        break;
                    case '+':
                    case '-':
                        jisuan1(TEMPCHAR);
                        result = jisuan2(c, result);
                        break;
                    case '*':
                    case '/':
                        jisuan1(c);
                        break;
                    default:
                        temp2 = temp2 * 10 + c - '0';
                        break;
                }
            }
            jisuan1(TEMPCHAR);
            result = jisuan2(TEMPCHAR, result);
            return result;
        }

        private void jisuan1(char c) {
            switch (lastsign2) {
                case 0:
                    temp1 = temp2;
                    break;
                case '*':
                    temp1 *= temp2;
                    break;
                case '/':
                    temp1 /= temp2;
                    break;
                default: {
                }
            }
            temp2 = 0;
            lastsign2 = c;
        }

        private int jisuan2(char c, int result) {
            switch (lastsign1) {
                case 0:
                    result = temp1;
                    break;
                case '-':
                    result -= temp1;
                    break;
                case '+':
                    result += temp1;
                    break;
                default: {
                }
            }
            temp1 = 0;
            lastsign1 = c;
            return result;
        }
    }
}
