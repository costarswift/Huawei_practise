package April28_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ99 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        solution(n);
    }

    private static void solution(int n) {
        int ans = 0;
        while (n >= 0){
            int lastNum = n % 10;
            if (lastNum == 0 || lastNum == 1 || lastNum == 5 || lastNum == 6){
                int m = n;
                int level = 1;
                while (m > 0){
                    m /= 10;
                    level *= 10;
                }
                if ((n * n -n) % level == 0){
                    ans++;
                }
            }
            n--;
        }
        System.out.println(ans);
    }
}
