package May05_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ33 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ipAddress = br.readLine();
        long num = Long.parseLong(br.readLine());
        System.out.println(solution(ipAddress));
        System.out.print(solution(num));
    }

    private static long solution(String ipAddress) {
        String[] strings = ipAddress.split("\\.");
        long ans = 0;
        for (int i = 0; i < strings.length; i++) {
            int tem = Integer.parseInt(strings[i]);
            ans += (long)tem * Power((3 - i) * 8);
        }
        return ans;
    }

    private static String solution(long num) {
        return String.valueOf(num / Power(24)) + '.' +
                num % Power(24) / Power(16) + '.' +
                num % Power(16) / Power(8) + '.' +
                num % Power(8);
    }
    private static int Power(int i){
        return (int)Math.pow(2, i);
    }
}