package March30_2023;

import java.util.Scanner;

public class HJ04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int length = s.length();
        int i = 0;
        while (i + 8 <= length) {
            System.out.println(s.substring(i, i + 8));
            i += 8;
        }
        if (i < length) {
            StringBuilder sb = new StringBuilder(s.substring(i, length));
            while(sb.length() < 8){
                sb.append("0");
            }
            System.out.println(sb.toString());
        }

    }
}
