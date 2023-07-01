package July01_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-07-01 下午 3:55
 * @Description 恢复数字序列
 */
public class B100_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        String input = inputs[0];
        int length = Integer.parseInt(inputs[1]);

        System.out.println(Solution(input, length));
    }

    private static int Solution(String input, int length) {
        int[] nums = new int[length];

        int ans = 0;
        int HightMount = input.length() % length;
        int LowMount = length - HightMount;
        int CountOfLow = input.length() / length;

        if (HightMount != 0){
            nums[LowMount] = CountOfLow == 1 ? 10 : 100;
            ans = nums[LowMount] - LowMount;
        }else {
            int[] numners = new int[10];
            char[] chars = input.toCharArray();
            for (char ch : chars){
                numners[ch - '0']++;
            }
        }
        return ans;
    }
}
