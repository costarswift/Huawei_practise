package July01_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-07-01 下午 1:31
 * @Description 矩阵稀疏扫描
 */
public class B100_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int M = Integer.parseInt(input.split(" ")[0]);
        int N = Integer.parseInt(input.split(" ")[1]);

        int[][] matrix = new int[M][N];
        //初始化矩阵
        for (int i = 0; i < M; i++) {
            String[] strings = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(strings[j]);
            }
        }

        //调用方法
        Solution(matrix);

    }

    private static void Solution(int[][] matrix) {
        int ans1 = 0, ans2 = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int[] value : matrix) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (value[j] == 0) count++;
            }
            if (count > m / 2) ans1++;
        }
        System.out.println(ans1);

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int[] ints : matrix) {
                if (ints[i] == 0) count++;
            }
            if (count > n / 2) ans2++;
        }
        System.out.println(ans2);
    }
}
