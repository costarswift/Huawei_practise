package May10_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ36 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String key = br.readLine();
        String string = br.readLine();

        solution(key, string);
    }

    private static void solution(String key, String string) {
        char[] chars = new char[26];
        char[] keys = key.toCharArray();
        int i = 0;
        int j = 0;
        String letter = "abcdefghijklmnopqrstuvwxyz";
        while (i < 26){
            if (j < key.length() && check(j, chars, key)){
                chars[i++] = key.charAt(j++);
            }else if (j < key.length()){
                j++;
            }else{
                if (check(j - key.length(), chars, letter)){
                    chars[i++] = letter.charAt(j - key.length());
                }
                j++;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char ch : string.toCharArray()){
            ans.append(chars[ch - 'a']);
        }
        System.out.println(ans.toString());
    }

    private static boolean check(int i, char[] chars, String key){
        char ch = key.charAt(i);
        for (char aChar : chars) {
            if (aChar == '0') break;
            if (aChar == ch) return false;
        }
        return true;
    }
}
