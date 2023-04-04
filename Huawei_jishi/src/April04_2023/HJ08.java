package April04_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class HJ08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        while (row-- > 0) {
            String[] s = br.readLine().split(" ");
            int key = Integer.parseInt(s[0]);
            int value = Integer.parseInt(s[1]);
            if (map.containsKey(key)) {
                map.put(key,value + map.get(key));
            }else {
                map.put(key,value);
            }
        }
        //输出
        map.forEach((key, value) -> System.out.println(key + " " + value));

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
