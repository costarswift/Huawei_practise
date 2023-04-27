package April27_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ96 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && Character.isDigit(chars[i])){
                sb.append("*");
            }

            if (i > 0 && Character.isDigit(chars[i]) && !Character.isDigit(chars[i - 1])){
                sb.append("*");
            }
            sb.append(chars[i]);

            if (i < chars.length - 1 && Character.isDigit(chars[i]) && !Character.isDigit(chars[i + 1])){
                sb.append("*");
            }

            if (i == chars.length - 1 && Character.isDigit(chars[i])){
                sb.append("*");
            }

        }
        System.out.println(sb.toString());
    }
}
