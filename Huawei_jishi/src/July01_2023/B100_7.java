package July01_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-07-01 下午 2:03
 * @Description 阿里巴巴找黄金宝箱(V)
 */
public class B100_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(",");
        int N = inputs.length;
        int k = Integer.parseInt(br.readLine());

        int[] nums = new int[inputs.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        int Max = 0;
        for (int i = 0; i < N - k; i++) {
            int temValue = 0;
            for (int j = i; j < i + k; j++) {
                temValue += nums[j];
            }
            Max = Math.max(Max, temValue);
        }
        System.out.println(Max);
    }
}
