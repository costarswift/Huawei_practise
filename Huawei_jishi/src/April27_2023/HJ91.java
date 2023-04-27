package April27_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ91 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);
        System.out.println(solution(n, m));

    }

    private static int solution(int n, int m) {
        if (n == 0 || m == 0){
            return 1;
        }
        return solution(n, m - 1) + solution(n - 1, m);
    }
}
