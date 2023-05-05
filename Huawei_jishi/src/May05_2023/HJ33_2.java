package May05_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ33_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ipAddress = br.readLine();
        long num = Long.parseLong(br.readLine());
        solution(ipAddress);
        System.out.print(solution(num));
    }

    private static void solution(String ipAddress) {
        String[] strings = ipAddress.split("\\.");
        System.out.println(Long.parseLong(strings[0]) << 24 | Long.parseLong(strings[1]) << 16
                | Long.parseLong(strings[2]) << 8 | Long.parseLong(strings[3]));
    }

    private static String solution(long num) {
        return String.valueOf(num >> 24) + '.' +
                (num >> 16 & 255) + '.' +
                (num >> 8 & 255) + '.' +
                (num & 255);
    }
}
