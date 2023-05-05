package May05_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ32 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    private static int solution(String s) {
        int ans = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int tem = Math.max(Method(i, i, chars), Method(i, i + 1, chars));
            ans = Math.max(ans, tem);
        }
        return ans;
    }

    private static int Method(int left, int right, char[] chars) {
        while (left >= 0 && right < chars.length) {
            if (chars[left] != chars[right]) break;
            left--;
            right++;
        }
        return right - left - 1;
    }
}
