package May10_2023;

import java.util.Scanner;

public class HJ38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        double height = (double)n;
        double ans = 0.0;
        int num = 5;

        while (num-- > 0){
            ans += height + height / 2;
            height /= 2;
        }
        System.out.println(ans - height);
        System.out.println(height);
    }
}
