package June29_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-06-29 下午 4:27
 * @Description 需要打开多少监视器
 */
public class B100_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int m = Integer.parseInt(input.split(" ")[0]);
        int n = Integer.parseInt(input.split(" ")[1]);

        int[][] Park = new int[m][n];

        for (int i = 0; i < m; i++) {
            String[] strings = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                Park[i][j] = Integer.parseInt(strings[j]);
            }
        }

        int ans = Solution(Park, m, n);
        System.out.println(ans);
    }

    private static int Solution(int[][] nums, int m, int n){
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 1){
                    ans++;
                    //将该点上方改为2
                    if (i - 1 >= 0 && nums[i - 1][j] == 0){
                        nums[i - 1][j] = 2;
                        ans++;
                    }
                    //将该点下方改为2
                    if (i + 1 < m && nums[i + 1][j] == 0){
                        nums[i + 1][j] = 2;
                        ans++;
                    }
                    //将该点左边改为2
                    if (j - 1 >= 0 && nums[i][j - 1] == 0){
                        nums[i][j - 1] = 2;
                        ans++;
                    }
                    //将该点右边改为2
                    if (j + 1 < n && nums[i][j + 1] == 0){
                        nums[i][j + 1] = 2;
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}
