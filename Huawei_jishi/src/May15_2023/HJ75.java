package May15_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ75 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars1 = br.readLine().toCharArray();
        char[] chars2 = br.readLine().toCharArray();

        int max = 0;
        for(int i = 0; i < chars1.length; i++){
            for(int j = 0; j < chars2.length; j++){
                int t1 = i;
                int t2 = j;
                int count = 0;
                while(chars1[t1] == chars2[t2]){
                    t1++;
                    t2++;
                    count++;
                    if(t1 == chars1.length || t2 == chars2.length) break;
                }
                max = Math.max(count, max);
            }
        }
        System.out.println(max);
    }
}
