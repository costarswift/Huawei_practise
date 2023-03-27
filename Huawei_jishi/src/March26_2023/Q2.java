package March26_2023;

import java.util.Scanner;

public class Q2 {
    /**
     * 2.明明的随机数
     * 明明生成了
     * N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
     * @param args
     */
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

    /*链接：https://www.nowcoder.com/questionTerminal/3245215fffb84b7b81285493eae92ff0
    来源：牛客网

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //获取个数
            int num = sc.nextInt();
            //创建TreeSet进行去重排序
            TreeSet set = new TreeSet();
            //输入
            for(int i =0 ; i < num ;i++){
                set.add(sc.nextInt());
            }

            //输出
            Iterator iterator = set.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }*/
}
