package May13_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ67 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int[] nums = new int[4];
        int[] visit = new int[4];
        boolean flag = false;
        for (int i = 0; i < 4; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        for (int i = 0; i < 4; i++) {
            visit[i] = 1;
            if (dfs(nums, visit, nums[i])){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }

    private static boolean dfs(int[] nums, int[] visit, int temp) {
        for (int i = 0; i < 4; i++) {
            if (visit[i] == 0) {
                visit[i] = 1;
                if (dfs(nums, visit, temp + nums[i])
                        || dfs(nums, visit, temp - nums[i])
                        || dfs(nums, visit, temp * nums[i])
                        || (temp % nums[i] == 0 && dfs(nums, visit, temp / nums[i]))) {
                    return true;
                }
                visit[i] = 0;
            }
        }
        return temp == 24;
    }
}
