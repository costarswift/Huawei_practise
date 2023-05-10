package May10_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HJ43 {
    private static ArrayList<String> arrayList = new ArrayList<>();
    private static Integer row;
    private static Integer vol;
    private static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] strings = line1.split(" ");
        row = Integer.parseInt(strings[0]);
        vol = Integer.parseInt(strings[1]);
        int[][] map = new int[row][vol];

        for (int i = 0; i < row; i++) {
            String[] strings1 = br.readLine().split(" ");
            for (int j = 0; j < vol; j++) {
                map[i][j] = Integer.parseInt(strings1[j]);
            }
        }

        search(map,0, 0);
    }

    private static void search(int[][] map, int i, int j) {
        if (flag) return;
        if (i >= row || j >= vol || i < 0 || j < 0 || map[i][j] == 1) {
            return;
        }
        if (i == row - 1 && j == vol - 1){
            arrayList.add("(" + i +","+ j +")");
            for (String s : arrayList) {
                System.out.println(s);
            }
            flag = true;
            return;
        }

        arrayList.add("(" + i +","+ j +")");
        map[i][j] = 1;

        search(map, i, j + 1);
        search(map, i + 1, j);
        search(map, i - 1, j);
        search(map, i, j - 1);

        arrayList.remove(arrayList.size() - 1);
        map[i][j] = 0;
    }
}
