package May12_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ64 {
    private static int mountOfSongs;
    private static int chosed = 1;
    private static int start = 1;
    private static int end;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mountOfSongs = Integer.parseInt(br.readLine());
        char[] commands = br.readLine().toCharArray();
        for (char ch : commands){
            if (ch == 'U'){
                UP();
            }else {
                DOWN();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (start <= end){
            sb.append(start++).append(' ');
        }
        String output = sb.toString().trim();
        System.out.println(output);
        System.out.println(chosed);

    }

    //UP方法
    private static void UP(){
        if (chosed == 1 && mountOfSongs >= 4){
            chosed = mountOfSongs;
            start = mountOfSongs - 3;
            end = chosed;
        } else if (chosed == 1) {
            chosed = mountOfSongs;
            start = 1;
            end = mountOfSongs;
        } else if (chosed == start) {
            chosed -= 1;
            start -= 1;
            end -= 1;
        } else {
            chosed -= 1;
        }
    }

    //DOWN方法
    private static void DOWN(){
        if (chosed == mountOfSongs && mountOfSongs >= 4){
            chosed = 1;
            start = 1;
            end = 4;
        } else if (chosed == mountOfSongs) {
            chosed = 1;
            start = 1;
            end = mountOfSongs;
        } else if (end == chosed) {
            chosed += 1;
            start += 1;
            end += 1;
        } else {
            chosed += 1;
        }
    }
}
