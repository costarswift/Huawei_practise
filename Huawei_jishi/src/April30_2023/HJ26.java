package April30_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ26 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        solution(input);
    }

    private static void solution(String s) {
        char[] chars = s.toCharArray();
        char[] chars_copy = new char[chars.length];
        int offset = 0;
        for (int i = 'A'; i <= 'Z'; i++) {
            for (char ch : chars) {
                if (!Character.isLetter(ch)) continue;
                if (ch == i || ch == i + 32) {
                    chars_copy[offset++] = ch;
                }
            }
        }
        offset = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])){
                chars[i] = chars_copy[offset++];
            }
        }
        System.out.println(new String(chars));
    }
}
