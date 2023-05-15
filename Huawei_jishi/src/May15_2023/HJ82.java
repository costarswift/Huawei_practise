package May15_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ82 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null){
            String[] strings = input.split("/");
            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);

            while (a != 1){
                if (b % a == 0){
                    b /= a;
                    a = 1;
                    continue;
                }
                if (b % (a - 1) == 0){
                    System.out.print("1/" + b / (a-1) + "+");
                    a = 1;
                }else{
                    int c = b / a + 1;
                    a -= b % a;
                    b *= c;
                    System.out.print("1/" + c + "+");
                }
            }
            System.out.println("1/" + b);
        }
    }
}
