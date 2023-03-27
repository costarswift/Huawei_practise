package March27_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ02 {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String c = in.nextLine();

        int ans = 0;
        for (int i = 0; i < string.length(); i++) {
            if (c.equalsIgnoreCase(String.valueOf(string.charAt(i)))) ans++;
        }
        System.out.println(ans);
    }*/

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine().toLowerCase();
        char c = in.nextLine().toLowerCase().charAt(0);

        int ans = 0;
        for (int i = 0; i < string.length(); i++) {
            if (c - string.charAt(i) == 0) ans++;
        }
        System.out.println(ans);
    }*/


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars1 = br.readLine().toLowerCase().toCharArray();
        char[] chars2 = br.readLine().toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == chars2[0]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
