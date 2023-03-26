package March26_2023;

import java.util.Scanner;

public class Q3 {
    /**
     * 3.进制转换
     * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
     * @param args
     */
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        char[] chars = string.toCharArray();

        int ans = 0;
        for (int i = chars.length - 1; i > 1; i--) {
            if (Character.isDigit(chars[i])) {
                ans += (chars[i] - '0') * valueOfPower(chars.length - i - 1);
            } else {
                ans += (chars[i] - 'A' + 10) * valueOfPower(chars.length - i - 1);
            };
        }
        System.out.println(Integer.toString(ans));
    }

    private static int valueOfPower(int n) {
        int ans = 1;
        while (n-- > 0) {
            ans *= 16;
        }
        return ans;
    }*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        char[] chars = string.toCharArray();

        int ans = 0;
        for (int i = 2; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                ans = (chars[i] - '0') + ans * 16;
            } else {
                ans = (chars[i] - 'A' + 10) + ans * 16;
            };
        }
        System.out.println(Integer.toString(ans));
    }
}
