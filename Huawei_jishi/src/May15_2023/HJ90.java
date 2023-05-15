package May15_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class HJ90 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null){
            String[] strs = input.split("\\.");
            if (strs.length != 4){
                System.out.println("NO");
                return;
            }
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].contains(" ") || "".equals(strs[i])){
                    System.out.println("NO");
                    break;
                }
                int strInt = Integer.parseInt(strs[i]);
                if (strs[i].equals(String.valueOf(strInt)) && strInt >= 0 && strInt <= 255){
                    if (i == strs.length-1){
                        System.out.println("YES");
                    }
                }else {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}
