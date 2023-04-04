package April04_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HJ10 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int ans = 0;
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < string.length(); i++){
            if (set.contains(string.charAt(i))) continue;
            ans++;
            set.add(string.charAt(i));
        }

        System.out.println(ans);
    }*/

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] nums = new int[128];
        int ans = 0;
        for (int i = 0; i < s.length(); i++){
            char b = s.charAt(i);
            if (nums[b] == 0){
                ans++;
                nums[b] = 1;
            }
        }
        System.out.println(ans);
    }
}
