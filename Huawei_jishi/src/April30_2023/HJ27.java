package April30_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HJ27 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[input.length - 1]);

        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (check(input[input.length - 2], input[i])){
                list.add(input[i]);
            }
        }
        System.out.println(list.size());
        if (list.size() >= k){
            Collections.sort(list);
            System.out.println(list.get(k - 1));
        }
    }

    private static boolean check(String s1, String s2){
        if (s1 == null || s1.equals(s2)) return false;
        if (s1.length() != s2.length()) return false;

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) return false;
        }
        return true;
    }
}
