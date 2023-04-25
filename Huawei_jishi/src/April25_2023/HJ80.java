package April25_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HJ80 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums1Length = Integer.parseInt(br.readLine());
        int[] nums1 = StringToInt(br.readLine().split(" "));
        int nums2Length = Integer.parseInt(br.readLine());
        int[] nums2 = StringToInt(br.readLine().split(" "));

        solution(nums1, nums2);

    }

    public static int[] StringToInt(String[] strings){
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++){
            nums[i] = Integer.parseInt(strings[i]);
        }
        return nums;
    }

    public static void solution(int[] nums1, int[] nums2){
        int length = nums1.length + nums2.length;
        int[] nums = new int[length];

        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i - 1] == nums[i]){
                continue;
            }
            System.out.print(nums[i]);
        }
    }
}
