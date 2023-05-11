package May11_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ45 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0){
            solution(br.readLine());
        }
    }

    private static void solution(String s) {
        int[] nums = new int[26];
        char[] chars = s.toCharArray();
        for (char ch : chars){
            if (Character.isUpperCase(ch)){
                nums[ch - 'A']++;
            }else {
                nums[ch - 'a']++;
            }
        }

        Arrays.sort(nums);
        int tem = 26;
        int ans = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) break;
            ans += tem-- * nums[i];
        }
        System.out.println(ans);
    }

}
