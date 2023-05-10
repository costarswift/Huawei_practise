package May10_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HJ41 {
    private static Set<Integer> hashSet = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] m = strings2int(br.readLine().split(" "));
        int[] x = strings2int(br.readLine().split(" "));

        for (int i = 0; i < n; i++) {
            solution(i, m, x);
        }
        System.out.println(hashSet.size());
    }

    private static void solution(int i, int[] m, int[] x) {
        int weight = m[i];
        int mount = x[i];
        if (hashSet.size() != 0){
            List<Integer> list = new ArrayList<>(hashSet);
            for (int num : list){
                for (int j = 0; j <= mount; j++) {
                    hashSet.add(num + j * weight);
                }
            }
        }else {
            for (int j = 0; j <= mount; j++) {
                hashSet.add(j * weight);
            }
        }

    }

    private static int[] strings2int(String[] strings){
        int len = strings.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        return nums;
    }
}
