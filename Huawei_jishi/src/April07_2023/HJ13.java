package April07_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] strings = input.split(" ");
        int len = strings.length;
        StringBuilder sb = new StringBuilder();
        while (len-- > 0){
            sb.append(strings[len]);
            if(len != 0) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
