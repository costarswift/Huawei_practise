package July03_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-07-03 下午 5:51
 * @Description 五子棋迷
 */
public class B100_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int currentColor = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(",");

        int[] nums = new int[inputs.length];
        int[] numsHelp = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        int len = nums.length, maxLength = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0){
                int tem = maxLengthMethod(nums, i, currentColor);
                if (tem >= maxLength){
                    maxLength = tem;
                    numsHelp[i] = 1;
                }
            }
        }

        int ans = -1;
        for (int j = numsHelp.length - 1; j >= 0; j--){
            if (numsHelp[j] == 1){
                ans = j;
                break;
            }
        }

        System.out.println(ans);
    }

    private static int maxLengthMethod(int[] nums, int position, int currentColor){
        int left = position - 1, right = position + 1;

        while (left >= 0){
            if (nums[left] != currentColor) break;
            left--;
        }

        while (right < nums.length){
            if (nums[right] != currentColor) break;
            right++;
        }

        return right - left + 1;
    }
}
