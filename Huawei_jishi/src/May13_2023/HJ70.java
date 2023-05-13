package May13_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class HJ70 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(strings[0]);
            arr[i][1] = Integer.parseInt(strings[1]);
        }

        char[] chars = br.readLine().toCharArray();

        int tem = n - 1;
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        for(int i = chars.length - 1; i >= 0; i--) {
            char ch = chars[i];
            if(ch == ')') {
                stack.push(-1);
            }else if(ch == '(') {
                int n1 = stack.pop();
                int n2 = stack.pop();
                sum += arr[n1][0] * arr[n2][0] * arr[n2][1];
                arr[n1][1] = arr[n2][1];
                stack.pop();
                stack.push(n1);
            }else {
                stack.push(tem);
                tem--;
            }
        }
        System.out.println(sum);
    }

}
