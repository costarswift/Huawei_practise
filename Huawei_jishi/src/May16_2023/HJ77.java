package May16_2023;

import java.util.*;

public class HJ77 {
    private static Stack<String> in = new Stack<>(); //入站
    private static Stack<String> wait = new Stack<>(); //等待出站
    private static List<String> list = new ArrayList<>();


    public static void trainOut(String str) {
        if (wait.isEmpty() && in.isEmpty()) {
            list.add(str.trim());
            return;
        }
        //出站一辆车
        if (!wait.isEmpty()) {
            String tmp = wait.pop();
            trainOut(str + " " + tmp);
            //恢复
            wait.push(tmp);
        }
        if (!in.isEmpty()) {
            String tmp = in.pop();
            wait.push(tmp);
            trainOut(str);
            //恢复
            in.push(tmp);
            wait.pop();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.nextLine();
            String[] ss = str.split(" ");
            for (int i = n - 1; i >= 0; i--) {
                in.push(ss[i]);
            }
            trainOut("");
            Collections.sort(list);
            for (String s : list)
                System.out.println(s);
        }

    }
}
