package May11_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ57 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars1 = br.readLine().toCharArray();
        char[] chars2 = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        int i = chars1.length - 1, j = chars2.length - 1, jump = 0;
        while (i >= 0 || j >= 0) {
            int tem = jump;
            if (j >= 0){
                tem += chars2[j--] - '0';
            }
            if (i >= 0){
                tem += chars1[i--] - '0';
            }
            sb.append(tem % 10);
            jump = tem > 9 ? 1 : 0;
        }
        if (jump == 1) sb.append('1');
        System.out.println(sb.reverse());
    }
}
