package April28_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ105 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int numOfNegetive = 0, sum = 0, numOfOther = 0;
        while ((input = br.readLine()) != null){
            int num = Integer.parseInt(input);
            if (num < 0){
                numOfNegetive++;
            }else {
                numOfOther++;
                sum += num;
            }
        }
        System.out.println(numOfNegetive);
        if (numOfOther == 0){
            System.out.println("0.0");
        } else {
            System.out.printf("%.1f%n", sum * 1.0 / numOfOther);
        }

        long s=Math.round(sum * 10.0 / numOfOther);
        System.out.println(s / 10 + "." + s % 10);
    }
}
