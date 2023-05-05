package May05_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        encode(s1);
        decode(s2);
    }

    private static void decode(String s2) {
        char[] chars = s2.toCharArray();
        for (int i = 0; i < chars.length; i++){
            char ch = chars[i];
            if (ch >= 'A' && ch <= 'Z'){
                chars[i] = ch == 'A' ? 'z' : (char)(ch + 31);
            }else if (ch >= 'a' && ch <= 'z'){
                chars[i] = ch == 'a' ? 'Z' : (char)(ch - 33);
            } else if (ch >= '0' && ch <= '9') {
                chars[i] = ch == '0' ? '9' : (char)(ch - 1);
            }
        }
        System.out.println(new String(chars));
    }

    private static void encode(String s1) {
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++){
            char ch = chars[i];
            if (ch >= 'A' && ch <= 'Z'){
                chars[i] = ch == 'Z' ? 'a' : (char)(ch + 33);
            }else if (ch >= 'a' && ch <= 'z'){
                chars[i] = ch == 'z' ? 'A' : (char)(ch - 31);
            } else if (ch >= '0' && ch <= '9') {
                chars[i] = ch == '9' ? '0' : (char)(ch + 1);
            }
        }
        System.out.println(new String(chars));
    }
}
