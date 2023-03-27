package March27_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ03 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] nums = new int[500];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(bf.readLine());
            if (nums[num - 1] == 0) nums[num - 1] = num;
        }

        for (int i = 0; i < 500; i++) {
            if (nums[i] != 0) System.out.println(nums[i]);
        }
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[500];
        for(int i = 0; i < n; i++){
            int num = in.nextInt();
            if(nums[num - 1] == 0) nums[num - 1] = num;
        }

        for(int i = 0; i < 500; i++){
            if(nums[i] != 0) System.out.println(nums[i]);
        }
    }
}
