package March26_2023;

import java.util.Scanner;

public class Q1 {
    /**
     * 1.汽水瓶
     * 某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
     * 小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
     * @param args
     */
    /*public static void main(String[] args) {
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
    }*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int m = in.nextInt();
            if(m == 0) break;
            System.out.println(m / 2);
        }
    }
}
