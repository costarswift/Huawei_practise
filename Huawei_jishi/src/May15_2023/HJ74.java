package May15_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ74 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] chars = input.toCharArray();

        int mount = 0;
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < chars.length) {
            if (chars[i] == '\"') {
                i++;
                while (i < chars.length && chars[i] != '\"') {
                    sb.append(chars[i++]);
                }
                i += 2;
            } else {
                while (i < chars.length && chars[i] != ' ') {
                    sb.append(chars[i++]);
                }
                i++;
            }
            mount++;
            sb.append("\n");
        }
        System.out.println(mount + "\n" + sb);
    }
}
