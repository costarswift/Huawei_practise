package June29_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-06-29 下午 5:27
 * @Description 告警抑制
 */
public class B100_2 {
    //定义一个map用来查询一个告警是否被抑制
    private static Map<String, String> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0){
            String[] strings = br.readLine().split(" ");
            map.put(strings[1], strings[0]);
        }

        System.out.println(Solution(br.readLine()));
    }

    private static String Solution(String input){
        StringBuilder output = new StringBuilder();
        String[] strings = input.split(" ");
        output.append(strings[0]).append(" ");

        for (int i = 1; i < strings.length; i++) {
            String s1 = map.get(strings[i]);
            if (s1 == null || !s1.equals(strings[i - 1])){
                output.append(strings[i]).append(" ");
            }
        }
        return output.toString().trim();
    }
}
