package May12_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ59_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if (input.indexOf(aChar) == input.lastIndexOf(aChar)) {
                System.out.println(aChar);
                return;
            }
        }
        System.out.println(-1);
    }
}
