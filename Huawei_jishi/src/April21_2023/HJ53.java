package April21_2023;

import java.util.Scanner;

public class HJ53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(findEvenNum(n));
        }
    }

    public static int findEvenNum(int n){
        if (n <= 2) return -1;

        int res;
        if ((n - 2) % 4 == 0){
            res = 4;
        }else if ((n - 2) % 4 == 1 || (n - 2) % 4 == 3){
            res = 2;
        }else{
            res = 3;
        }
        return res;
    }
}
