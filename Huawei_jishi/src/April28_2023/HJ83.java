package April28_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ83 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            String[] strs = str.split(" ");
            //1. 行和列
            int row = Integer.parseInt(strs[0]);
            int column = Integer.parseInt(strs[1]);
            if (row >= 0 && row <= 9 && column >= 0 && column <= 9) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }

            //2.单元格的 行 列值
            String[] values = br.readLine().split(" ");
            int x1 = Integer.parseInt(values[0]);
            int y1 = Integer.parseInt(values[1]);
            int x2 = Integer.parseInt(values[2]);
            int y2 = Integer.parseInt(values[3]);

            if (x1 >= 0 && x1 < row && x2 >= 0 && x2 < row
                    && y1 >= 0 && y1 < column && y2 >= 0 && y2 < column) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }

            //3. 插入的行的值
            int insertRowValue = Integer.parseInt(br.readLine());
            if (insertRowValue >= 0 && insertRowValue < row && (row + 1) <= 9) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            //4. 插入的列的值
            int insertColumnValue = Integer.parseInt(br.readLine());
            if (insertColumnValue >= 0 && insertColumnValue < column && (column + 1) <= 9) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            //5. 运动轨迹的单元格
            strs = br.readLine().split(" ");
            int x3 = Integer.parseInt(strs[0]);
            int y3 = Integer.parseInt(strs[1]);
            if (x3 >= 0 && x3 < row && y3 >= 0 && y3 < column) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
        br.close();
    }
}
