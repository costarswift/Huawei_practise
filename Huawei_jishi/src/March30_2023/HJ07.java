package March30_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            int index = str.indexOf(".");
            int ans = Integer.parseInt(str.substring(0, index));
            if (str.charAt(index + 1) >= '5') ans++;
            System.out.println(ans);
        }
    }

    /*public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        double xx = Double.parseDouble(num);
        System.out.println((int)(xx + 0.5));
    }*/
}
