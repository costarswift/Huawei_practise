package April28_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ97 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");

        int inpositive = 0;
        int positive = 0;
        int nums = 0;
        for (String s : strings) {
            if (Integer.parseInt(s) < 0){
                inpositive++;
            } else if (Integer.parseInt(s) > 0) {
                positive++;
                nums += Integer.parseInt(s);
            }
        }
        /*if (positive == 0){
            System.out.println(inpositive + " 0.0");
        }else {
            System.out.println(inpositive + " " + String.format("%.1f", nums / 1.0 / positive));
            System.out.println(inpositive + " " + Math.round(nums * 10.0 / positive) / 10.0);
        }*/

        System.out.print(inpositive + " ");
        if (positive == 0){
            System.out.println("0.0");
        }else {
            System.out.printf("%.1f%n", nums / 1.0 / positive);
        }
    }
}
