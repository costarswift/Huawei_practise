package July03_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-07-03 下午 4:38
 * @Description 疫情期间座位调整
 */
public class B100_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(",");

        int ans = 0;
        for (int i = 0; i < inputs.length; i++) {
            if ("0".equals(inputs[i])){
                int tem = 1;
                for (int j = i + 1; j < inputs.length; j++) {
                    if (!"0".equals(inputs[j])){
                        i = j - 1;
                        break;
                    }
                    tem++;
                }
                ans += (tem - 1) / 2;
            }
        }

        System.out.println(ans);
    }
}
