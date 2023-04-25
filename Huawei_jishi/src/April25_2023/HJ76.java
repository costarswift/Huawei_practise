package April25_2023;

import java.util.Scanner;

public class HJ76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int m = in.nextInt();
            solution(m);
        }
    }

    public static void solution(int m) {
        int first = m * m - m + 1;

        StringBuilder sb = new StringBuilder();
        sb.append(first);
        while (--m > 0) {
            first += 2;
            sb.append("+").append(first);
        }

        System.out.println(sb.toString());
    }
}
