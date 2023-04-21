package April17_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            //获取第i个字符
            char c = str.charAt(i);
            //判断，处理
            if (c >= 'A' && c < 'Z') {
                c = (char) (c + 'b' - 'A');
            } else if (c == 'Z') {
                c = 'a';
            } else if (c>='a' && c<='c') {
                c = '2';
            } else if (c>='d' && c<='f') {
                c = '3';
            } else if (c>='g' && c<='i') {
                c = '4';
            } else if (c>='j' && c<='l') {
                c = '5';
            } else if (c>='m' && c<='o') {
                c = '6';
            } else if (c>='p' && c<='s') {
                c = '7';
            } else if (c>='t' && c<='v') {
                c = '8';
            } else if (c>='w' && c<='z') {
                c = '9';
            }
            sb.append(c);
        }
        System.out.println(sb.toString().trim());
    }

    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder ans = new StringBuilder();
        for (char ch : input.toCharArray()){
            if (Character.isDigit(ch)){
                ans.append(ch);
            }else if (Character.isUpperCase(ch)){
                ans.append(exchangeUpperAlphaBelt(ch));
            }else{
                ans.append(exchangeLowerAlphaBelt(ch));
            }
        }
        System.out.println(ans.toString());

    }

    private static char exchangeUpperAlphaBelt(char ch){
        if ('Z' == ch) return 'a';
        return (char)(ch - 'A' + 'a' + 1);
    }

    private static int exchangeLowerAlphaBelt(char ch){
        int tem = ch - 'a';
        if (tem >= 0 && tem <= 2){
            return 2;
        }
        if (tem >= 3 && tem <= 5){
            return 3;
        }
        if (tem >= 6 && tem <= 8){
            return 4;
        }
        if (tem >= 9 && tem <= 11){
            return 5;
        }
        if (tem >= 12 && tem <= 14){
            return 6;
        }
        if (tem >= 15 && tem <= 18){
            return 7;
        }
        if (tem >= 19 && tem <= 21){
            return 8;
        }else {
            return 9;
        }
    }*/
}
