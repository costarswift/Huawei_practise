package April07_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] chars = input.toCharArray();
        int len = chars.length;
        int pos = len >> 1;

        while (pos-- > 0) {
            char tem = chars[pos];
            chars[pos] = chars[len - 1 -pos];
            chars[len - 1 - pos] = tem;
        }

        System.out.println(String.valueOf(chars));

    }
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] chars = input.toCharArray();
        int length = chars.length;

        StringBuilder ans = new StringBuilder();
        while (length > 0) {
            ans.append(chars[length - 1]);
            length--;
        }

        System.out.println(ans.toString());

    }*/

    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder ans = new StringBuilder(br.readLine()).reverse();
        System.out.println(ans);
    }
    */

    /*public static void main(String[] args) throws IOException{
        InputStream is = System.in;
        int length = is.available() - 1;
        char[] chars = new char[length];
        while (length-- > 0){
            chars[length] = (char)is.read();
        }
        System.out.println(String.valueOf(chars));


    }*/
}
