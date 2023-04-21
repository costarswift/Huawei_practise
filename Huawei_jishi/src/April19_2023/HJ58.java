package April19_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ58 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        String[] strings1 = s1.split(" ");
        int n = Integer.parseInt(strings1[0]);
        int k = Integer.parseInt(strings1[1]);

        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            String[] strings2 = s2.split(" ");
            nums[i] = Integer.parseInt(strings2[i]);
        }

        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++){
            sb.append(nums[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
