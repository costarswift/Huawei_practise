package April28_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int[] nums = new int[128];
        for (char ch : chars){
            nums[ch]++;
        }

        int max = 0;
        for (int tem : nums){
            if (tem > max){
                max = tem;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (max != 0){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) continue;
                if (nums[i] == max) {
                    sb.append((char)i);
                    nums[i] = 0;
                }
            }
            max--;
        }

        System.out.println(sb.toString());
    }
}
