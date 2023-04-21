package April18_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HJ31 {
    //用正则表达式的方法求解
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] strings = input.split("[^a-zA-Z]+");

        StringBuilder sb = new StringBuilder();

        for (int i = strings.length - 1; i >= 0; i--){
            sb.append(strings[i]).append(" ");
        }

        System.out.println(sb.toString().trim());

    }
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            if (Character.isAlphabetic(input.charAt(i))){
                sb.append(input.charAt(i));
            }else{
                if (sb.length() > 0){
                    arrayList.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            }
        }
        //如果以单词结尾
        if (sb.length() > 0){
            arrayList.add(sb.toString());
            sb.delete(0, sb.length());
        }

        for (int i = arrayList.size() - 1; i >= 0; i--){
            sb.append(arrayList.get(i)).append(" ");
        }

        System.out.println(sb.toString().trim());

    }*/
}
