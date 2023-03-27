package March27_2023;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

//计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
public class HJ01 {
    public static void main(String[] args) {
        Method1();
        Method2();
    }

    static void Method1() {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        char[] chars = string.toCharArray();
        int ans = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isAlphabetic(chars[i])) {
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }

    static void Method2() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" "); //正则表达式实用性更强( str.split("\\s+"))
        int length = s[s.length - 1].length();
        System.out.println(length);
    }


    public static void Method3() throws IOException {
        InputStream inputStream = System.in;
        int length = 0;
        char c;
        while ('\n' != (c = (char) inputStream.read())) {
            length++;
            if (c == ' ') {
                length = 0;
            }
        }
        System.out.println(length);
    }

}
