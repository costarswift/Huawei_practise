package March30_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ05 {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        char[] chars = string.toCharArray();

        int ans = 0;
        for (int i = 2; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                ans = (chars[i] - '0') + ans * 16;
            } else {
                ans = (chars[i] - 'A' + 10) + ans * 16;
            };
        }
        System.out.println(Integer.toString(ans));
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(Long.parseLong(line.substring(2) , 16));
            System.out.println(Integer.parseInt(line.substring(2) , 16));
        }
    }
}
