package April23_2023;

import java.util.Scanner;

public class HJ62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            method1(n);
            method2(n);
        }
    }

    public static void method1(int n){
        int ans = 0;
        while (n != 0){
            if (n % 2 == 1){
                ans++;
            }
            n >>>= 1;
        }

        System.out.println(ans);
    }

    public static void method2(int n){
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int ans = 0;
        for (char ch: chars) {
            if (ch == '1') ans++;
        }

        System.out.println(ans);
    }
}
