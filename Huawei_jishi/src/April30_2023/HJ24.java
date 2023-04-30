package April30_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class HJ24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(strings[i]);
        }


        //left，遍历从左到i的升序个数
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = 1;//最起码当前数为1
            for (int j = 0; j < i; j++) {
                if (heights[j] < heights[i]) {
                    //每有一个比a[i]小的数，在left[j]的基础上加1和left[i]比大小，保证是升序数
                    left[i] = Math.max(left[j] + 1, left[i]);
                }
            }
        }
        //right，遍历从右到i的升序个数
        int[] right = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            right[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (heights[j] < heights[i]) {
                    right[i] = Math.max(right[j] + 1, right[i]);
                }
            }
        }
        int people = 1;//1<=n<=3000，所以最少为合唱队最少1个人
        for (int i = 0; i < n; i++) {
            //以当前数为中心，左右升序数相加减一即是合唱队,重合了最高的人所以减一
            //直接使用a[i]数组，创建新数组浪费空间
            heights[i] = left[i] + right[i] - 1;
            people = Math.max(people, heights[i]); //取合唱队最大值
        }
        System.out.println(n - people); //总人数减去最大合唱队人数就是要出列的同学人数

    }
}
