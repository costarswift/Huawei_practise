package April11_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strings = input.split(";");
        int row = 0;
        int vol = 0;

        for (String s : strings) {
            if (s.length() > 3 || s.length() < 2 || !Character.isAlphabetic(s.charAt(0)) ||
                    !Character.isDigit(s.charAt(1))) {
                continue;
            }

            if (s.startsWith("W")) {
                if (s.length() == 3 && Character.isDigit(s.charAt(2))) {
                    vol += 10 * (s.charAt(1) - '0') + (s.charAt(2) - '0');
                } else if (s.length() == 2) {
                    vol += s.charAt(1) - '0';
                }
            } else if (s.startsWith("A")) {
                if (s.length() == 3 && Character.isDigit(s.charAt(2))) {
                    row -= 10 * (s.charAt(1) - '0') + (s.charAt(2) - '0');
                } else if (s.length() == 2) {
                    row -= s.charAt(1) - '0';
                }
            } else if (s.startsWith("S")) {
                if (s.length() == 3 && Character.isDigit(s.charAt(2))) {
                    vol -= 10 * (s.charAt(1) - '0') + (s.charAt(2) - '0');
                } else if (s.length() == 2) {
                    vol -= s.charAt(1) - '0';
                }
            } else if (s.startsWith("D")) {
                if (s.length() == 3 && Character.isDigit(s.charAt(2))) {
                    row += 10 * (s.charAt(1) - '0') + (s.charAt(2) - '0');
                } else if (s.length() == 2) {
                    row += s.charAt(1) - '0';
                }
            }
        }

        System.out.println( row + "," + vol);
    }
}
