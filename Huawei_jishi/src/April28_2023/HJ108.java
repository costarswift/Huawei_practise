package April28_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int num1 = Integer.parseInt(strings[0]);
        int num2 = Integer.parseInt(strings[1]);
        System.out.println(solution(num1, num2));
    }

    private static int solution(int num1, int num2) {
        int ans = num1;
        while (ans % num2 != 0){
            ans += num1;
        }
        return ans;
    }
}
