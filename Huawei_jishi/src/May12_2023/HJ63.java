package May12_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ63 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] chars = input.toCharArray();
        int n = Integer.parseInt(br.readLine());

        int maxGC = 0;
        int index = 0;
        for (int i = 0; i <= chars.length - n; i++) {
            int numofGC = 0;
            for (int j = i; j < i + n; j++) {
                if (chars[j] == 'G' || chars[j] == 'C') numofGC++;
            }
            if (numofGC > maxGC){
                maxGC = numofGC;
                index = i;
            }
        }
        String output = input.substring(index, index + n);
        System.out.println(output);
    }
}
