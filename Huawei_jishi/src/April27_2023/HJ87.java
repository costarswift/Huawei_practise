package April27_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ87 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Solution(input);

    }

    private static void Solution(String s) {
        int score = 0;
        char[] chars = s.toCharArray();

        int numOfDigit = 0;
        int numOfUpper = 0;
        int numOfLower = 0;
        int numOfOther = 0;

        for (char ch : chars){
            if (Character.isDigit(ch)) {
                numOfDigit++;
            } else if (Character.isUpperCase(ch)) {
                numOfUpper++;
            } else if (Character.isLowerCase(ch)) {
                numOfLower++;
            } else {
                numOfOther++;
            }
        }

        //长度校验
        if (s.length() <= 4){
            score += 5;
        } else if (s.length() <= 7) {
            score += 10;
        }else {
            score += 25;
        }

        //字母校验
        if (numOfUpper != 0 && numOfLower != 0){
            score += 20;
        } else if (numOfUpper != 0 || numOfLower != 0) {
            score += 10;
        }

        //数字校验
        if (numOfDigit == 1){
            score += 10;
        }
        if (numOfDigit > 1) {
            score += 20;
        }

        //符号校验
        if (numOfOther == 1){
            score += 10;
        }
        if (numOfOther > 1){
            score += 25;
        }

        //奖励
        if (numOfUpper != 0 && numOfLower != 0
                && numOfDigit != 0 && numOfOther != 0){
            score += 5;
        } else if ((numOfUpper != 0 || numOfLower != 0)
                && numOfDigit != 0 && numOfOther != 0) {
            score += 3;
        } else if((numOfUpper != 0 || numOfLower != 0)
                && numOfDigit != 0) {
            score += 2;
        }

        //判断
        if (score >= 90){
            System.out.println("VERY_SECURE");
        } else if (score >= 80){
            System.out.println("SECURE");
        } else if (score >= 70) {
            System.out.println("VERY_STRONG");
        } else if (score >= 60) {
            System.out.println("STRONG");
        } else if (score >= 50) {
            System.out.println("AVERAGE");
        } else if (score >= 20) {
            System.out.println("WEAK");
        } else {
            System.out.println("VERY_WEAK");
        }
    }
}
