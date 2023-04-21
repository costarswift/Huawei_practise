package April19_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ34_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while((s = br.readLine()) != null){
            char[] result = s.toCharArray();
            Arrays.sort(result);
            System.out.println(String.valueOf(result));//调用new String()方法
            System.out.println(new String(result));
            System.out.println(result);

        }
    }
}
