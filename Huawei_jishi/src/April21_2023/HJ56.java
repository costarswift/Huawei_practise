package April21_2023;

import java.util.Scanner;

public class HJ56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();

            int ans = 0;
            while (--n > 1){
                if (isPerfectNum(n)){
                    System.out.println(n);
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }

    public static boolean isPerfectNum(int num){
        int sum = 1;

        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                sum += i;
                if (num / i != i){
                    sum += (num / i);
                }
            }
        }

        return sum == num;
    }
}
