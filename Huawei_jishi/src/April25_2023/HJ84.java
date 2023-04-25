package April25_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ84 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] chars = input.toCharArray();
        int ans = 0;
        for (char ch : chars){
            //if (Character.isUpperCase(ch)) ans++;
            if (ch >= 'A' && ch <= 'Z') ans++;
        }

        System.out.println(ans);
    }
}
