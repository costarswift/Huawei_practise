package April19_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ35 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int num = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                int start = (i - 1) * i / 2 + 1;
                int step = i + 1;
                for (int j = 1; j <= num - i + 1; j++) {
                    sb.append(start).append(" ");
                    start += step;
                    step++;
                }
                sb.setCharAt(sb.length() - 1, '\n');
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int N = in.nextInt();
            sneakMatrix(N);
        }
    }
    //输出蛇形矩阵方法
    public static void sneakMatrix(int N) {
        int[][] matrix = new int[N][N];
        matrix[0][0] = 1;

        for (int i = 1; i < N; i++) {
            matrix[i][0] = matrix[i - 1][0] + i;
        }

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(matrix[i][0]).append(" ");
            for (int j = 1; j < N - i; j++) {
                matrix[i][j] = matrix[i][j - 1] + i + j + 1;
                sb.append(matrix[i][j]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

    }*/
}
