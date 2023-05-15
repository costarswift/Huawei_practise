package May15_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ92_1 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null){
            char[] chars=str.toCharArray();
            int max = 0;
            String res = null;
            for(int i = 0;i < chars.length; i++){
                if(chars[i] >= '0' && chars[i] <= '9'){
                    int start=i;
                    while(i < chars.length && chars[i] >= '0' && chars[i] <= '9'){
                        i++;
                    }
                    int len = i - start;
                    if(len > max){
                        max = len;
                        res = str.substring(start,i);
                    }else if(len == max){
                        res = res + str.substring(start,i);
                    }
                }
            }
            System.out.println(res + "," + max);
        }
    }
}
