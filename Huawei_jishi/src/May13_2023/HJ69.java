package May13_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ69 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());

        int[][] nums1 = new int[x][y];
        int[][] nums2 = new int[y][z];

        for (int i = 0; i < x; i++) {
            String[] items = br.readLine().split(" ");
            for (int j = 0; j < y; j++) {
                nums1[i][j] = Integer.parseInt(items[j]);
            }
        }

        for (int i = 0; i < y; i++) {
            String[] items = br.readLine().split(" ");
            for (int j = 0; j < z; j++) {
                nums2[i][j] = Integer.parseInt(items[j]);
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                int sum = 0;
                for (int k = 0; k < y; k++) {
                    sum += nums1[i][k] * nums2[k][j];
                }
                System.out.print(sum);
                if (j == z - 1){
                    System.out.println();
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}
