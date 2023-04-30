package April30_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null){
            System.out.println(solution(input));
        }
    }

    private static String solution(String s) {
        //检查条件1
        if (s.length() <= 8){
            return "NG";
        }

        //检查条件2
        int UpperCase = 0, LowerCase = 0, Digit = 0, Other = 0;
        for (char ch : s.toCharArray()){
            if (Character.isUpperCase(ch)) UpperCase = 1;
            else if (Character.isLowerCase(ch)) LowerCase = 1;
            else if (Character.isDigit(ch)) Digit = 1;
            else  Other = 1;
        }
        int flag = UpperCase + LowerCase + Digit + Other;
        if (flag < 3){
            return "NG";
        }

        //检查条件3
        if (check(s)){
            return "NG";
        }
        return "OK";
    }

    //判断是否存在长度等于3的包含公共元素的字串，
    private static boolean check(String s) {
        for (int i = 0; i < s.length() - 3; i++) {
            for (int j = i + 3; j < s.length() - 3; j++) {
                if (s.charAt(i) == s.charAt(j)
                        && s.charAt(i + 1) == s.charAt(j + 1) && s.charAt(i + 2) == s.charAt(j + 2)){
                    return true;
                }
            }
        }
        return false;
    }
}
