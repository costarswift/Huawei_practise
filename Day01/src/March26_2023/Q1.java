package March26_2023;

import java.util.Scanner;

public class qishuiping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int n = in.nextInt();
            if (n == 0) return;
            System.out.println(num_drink(n));
        }
    }

    private static int num_drink(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return n / 3 + num_drink(n / 3 + n % 3);
    }
}
