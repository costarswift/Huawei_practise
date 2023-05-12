package May12_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ59 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int[] nums = new int[chars.length];
        for (char ch : chars) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 1000 == ch){
                    nums[i] += 1000;
                    break;
                }
                if (nums[i] == 0){
                    nums[i] = ch + 1000;
                    break;
                }
            }
        }

        for (int num : nums) {
            if (num / 1000 == 1) {
                System.out.println((char) (num % 1000));
                return;
            }
        }
        System.out.println("-1");
    }
}
