package April20_2023;

import java.util.Scanner;

public class HJ37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            solution(n);
        }
    }

    //求兔子数量方法
    public static void solution(int n){
        int birth = 1;
        int youth = 0;
        int adult = 0;

        while (--n > 0){
            adult += youth;
            youth = birth;
            birth = adult;
        }
        int ans = birth + youth + adult;
        System.out.println(ans);
    }
}
