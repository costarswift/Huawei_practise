package May15_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class HJ71 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine().toLowerCase(Locale.ROOT);
        String s2 = br.readLine().toLowerCase(Locale.ROOT);

        String regx = s1.replaceAll("\\*{2,}", "\\*");
        regx = regx.replaceAll("\\?", "[0-9a-z]{1}");
        regx = regx.replaceAll("\\*", "[0-9a-z]*");

        System.out.println(s2.matches(regx));

    }
}
