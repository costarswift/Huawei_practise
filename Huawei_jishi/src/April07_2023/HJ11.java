package April07_2023;

import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String s = Integer.toString(input);

        int length = s.length();
        char[] chars = s.toCharArray();

        StringBuilder ans = new StringBuilder();
        while (length > 0) {
            ans.append(chars[length - 1]);
            length--;
        }

        System.out.println(ans.toString());
    }
}
