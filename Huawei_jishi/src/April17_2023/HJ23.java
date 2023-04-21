package April17_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] nums = new int[26];
        char[] chars = input.toCharArray();

        for (char ch : chars){
            nums[ch - 'a']++;
        }

        int min = 20;
        for (int i : nums){
            if (i > 0 && i < min) min = i;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : chars){
            if (nums[ch - 'a'] > min){
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
