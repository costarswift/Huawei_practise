package May15_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ92 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null){
            String[] strings = input.split("[^0-9]+");
            int maxLength = 0;
            StringBuilder sb = new StringBuilder();
            for (String string : strings) {
                if (string.length() == maxLength) {
                    sb.append(string);
                }

                if (string.length() > maxLength) {
                    sb = new StringBuilder(string);
                    maxLength = string.length();
                }
            }
            System.out.println(sb + "," + maxLength);
        }
    }
}
