package May11_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ55 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(Integer.parseInt(br.readLine()));
    }

    private static void solution(int n) {
        int count = 0;
        for (int i = 7; i <= n; i++) {
            if (i % 7 == 0 || contains7(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean contains7(int n) {
        while (n > 6){
            if (n % 10 == 7){
                return true;
            }else {
                n /= 10;
            }
        }
        return false;
    }
}
