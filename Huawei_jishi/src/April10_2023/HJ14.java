package April10_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ14 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        String[] strings = new String[row];
        for (int i = 0; i < row; i++){
            strings[i] = br.readLine();
        }

        Arrays.sort(strings);
        //输出结果
        for (int i = 0; i < row; i++){
            if (i == row - 1){
                System.out.print(strings[i]);
            }else{
                System.out.println(strings[i]);
            }
        }
    }
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        String[] strings = new String[row];
        for (int i = 0; i < row; i++){
            strings[i] = br.readLine();
        }
        //对strings进行排序
        for (int i = 0; i < row - 1; i++){
            for (int j = i + 1; j < row; j++){
                if (strings[j].compareTo(strings[i]) < 0){
                    String tem = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tem;
                }
            }
        }
        //输出结果
        for (int i = 0; i < row; i++){
            if (i == row - 1){
                System.out.print(strings[i]);
            }else{
                System.out.println(strings[i]);
            }
        }
    }*/

}
