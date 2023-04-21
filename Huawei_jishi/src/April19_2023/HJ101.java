package April19_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line1 = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int line3 = Integer.parseInt(br.readLine());

        int[] nums = new int[line1];
        for (int i = 0; i < line1; i++){
            nums[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(nums);

        StringBuilder sb = new StringBuilder();
        if (line3 == 0){
            for (int i = 0; i < line1; i++){
                sb.append(nums[i]).append(" ");
            }
        }

        if (line3 == 1){
            for (int i = line1 - 1; i >= 0; i--){
                sb.append(nums[i]).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
