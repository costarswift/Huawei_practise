package April11_2023;

import java.io.InputStream;
import java.util.Scanner;

public class HJ15 {
    //求整型数字 二进制形式‘1’的个数
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int ans = 0;
        while (input != 0){
            ans++;
            input = input & (input - 1);//核心代码
        }
        System.out.println(ans);
    }*/

    public static void main(String [] args) throws Exception{
        InputStream stream = System.in;
        int l ;
        byte[] bytes = new byte[1024];
        while ((l = stream.read(bytes)) > 0) {
            String numStr = new String(bytes, 0, l - 1);
            int num = Integer.parseInt(numStr);
            char [] numChars = Integer.toBinaryString(num).toCharArray();
            int countNum = 0;
            for (char numChar : numChars) {
                if (numChar == '1') {
                    countNum++;
                }
            }
            System.out.println(countNum);
        }
    }
}
