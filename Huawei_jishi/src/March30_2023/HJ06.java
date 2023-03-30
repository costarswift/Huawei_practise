package March30_2023;

import java.util.Scanner;

public class HJ06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        StringBuilder ans = new StringBuilder();

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                ans.append(i).append(" ");
                num /= i;
                i--;
            }
        }
        System.out.println(ans.append(num));

    }
}
