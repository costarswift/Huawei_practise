package April28_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        solution(n);
        solution1(n);
    }

    private static void solution(int n) {
        int ans = 0;
        int first = 2;
        while (n-- > 0){
            ans += first;
            first += 3;
        }
        System.out.println(ans);
    }

    private static void solution1(int n) {
        System.out.println((3 * n * n + n) / 2);
    }
}
