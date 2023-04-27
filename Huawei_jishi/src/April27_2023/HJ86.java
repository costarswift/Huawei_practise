package April27_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ86 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        char[] chars = Integer.toBinaryString(input).toCharArray();

        int tem = 0, ans = 0;
        for (char aChar : chars) {
            tem = aChar == '1' ? tem + 1 : 0;
            ans = Math.max(tem, ans);
        }
        System.out.println(ans);
    }
}
