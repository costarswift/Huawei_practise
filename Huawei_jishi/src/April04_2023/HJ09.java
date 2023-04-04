package April04_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HJ09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String s = Integer.toString(num);
        StringBuilder ans = new StringBuilder();
        Set<Character> set = new HashSet<Character>();
        for (int i = s.length() - 1; i >= 0; i--){
            if (set.contains(s.charAt(i))) continue;
            ans.append(s.charAt(i));
            set.add(s.charAt(i));
        }
        System.out.println(Integer.parseInt(ans.toString()));
    }
}
