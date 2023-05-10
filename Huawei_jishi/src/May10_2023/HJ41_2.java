package May10_2023;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HJ41_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            int n = Integer.parseInt(line);
            String[] s1 = reader.readLine().split(" ");
            String[] s2 = reader.readLine().split(" ");
            int[] weight = new int[n];
            int[] number = new int[n];
            for (int i = 0; i < n; i++) {
                weight[i] = Integer.parseInt(s1[i]);
                number[i] = Integer.parseInt(s2[i]);
            }

            boolean[] exist = new boolean[10 * 10 * 2000];
            int[] arr = new int[20000];
            int count = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < number[i]; j++) {
                    int index = count;
                    for (int k = 0; k < index; k++) {
                        int sum = arr[k] + weight[i];
                        if (!exist[sum]) {
                            exist[sum] = true;
                            arr[count++] = sum;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
