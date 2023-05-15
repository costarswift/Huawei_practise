package May15_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double val = Double.parseDouble(br.readLine());

        double val_copy = val >= 0 ? val : -val;
        double ans = 0.0;
        while (ans * ans * ans < val_copy) {
            ans += 0.1;
        }
        if (ans * ans * ans == val_copy) {
            print(val, ans);
        }else if (ans * ans * ans - val_copy <= val_copy - (ans-0.1) * (ans-0.1) * (ans-0.1)){
            print(val, ans);
        }else {
            print(val, ans - 0.1);
        }
    }
    private static void print(double val, double ans){
        if (val >= 0) {
            System.out.printf("%.1f", ans);
        } else {
            System.out.printf("%.1f", -ans);
        }
    }
}
