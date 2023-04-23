package April23_2023;

import java.util.Scanner;

public class HJ60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            solution(n);
        }
    }

    public static void solution(int n){
        for (int i = n / 2; i >= 2; i--){
            if (isPrime(i) && isPrime(n - i)){
                System.out.println(i + "\n" + (n - i));
                break;
            }
        }
    }

    private static boolean isPrime(int num){
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
