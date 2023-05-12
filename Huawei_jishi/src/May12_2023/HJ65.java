package May12_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ65 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        String shortString = s1.length() <= s2.length() ? s1 : s2;
        String longString = s1.length() > s2.length() ? s1 : s2;

        char[] chars1 = shortString.toCharArray();
        char[] chars2 = longString.toCharArray();

        int i, j, start = 0, maxLength = 0;
        for (int k = 0; k < chars1.length; k++) {
            for (int l = 0; l < chars2.length; l++) {
                if (chars1[k] == chars2[l]) {
                    i = k + 1;
                    j = l + 1;
                    while (i < chars1.length && j < chars2.length && chars1[i] == chars2[j]) {
                        i++;
                        j++;
                    }
                    if (i - k > maxLength) {
                        start = k;
                        maxLength = i - k;
                    }
                    l = j;
                }
            }
        }

        String output = shortString.substring(start, start + maxLength);
        System.out.println(output);
    }
}
