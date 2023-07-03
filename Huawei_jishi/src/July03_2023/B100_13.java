package July03_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-07-03 下午 5:00
 * @Description 阿里巴巴宝箱(II)
 */
public class B100_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(",");

        int[] nums = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        System.out.println(Solution(nums));
    }

    private  static int Solution(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
        }
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        int[] nums_2 = new int[values.size()];
        for (int i = 0; iterator.hasNext(); i++) {
            nums_2[i] = iterator.next();
        }

        Arrays.sort(nums_2);
        int mount = (nums.length + 1) / 2;
        int ans = 1;
        for (int i = nums_2.length - 1; i >= nums_2.length / 2; i--) {
            if (nums_2[i] >= mount) return ans;
            ans++;
            mount -= nums_2[i];
        }
        return ans;
    }
}
