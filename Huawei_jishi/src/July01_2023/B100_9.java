package July01_2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-07-01 下午 2:34
 * @Description 文件目录大小
 */
public class B100_9 {
    private static ArrayList<B100_9_TreeNode> arrayList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int M = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);

        while (M-- > 0){
            String[] strings = br.readLine().split(" ");
            int id = Integer.parseInt(strings[0]);
            int size = Integer.parseInt(strings[1]);
            if (strings[2].length() == 2){
                arrayList.add(new B100_9_TreeNode(id, size, null));
                continue;
            }
            String[] sonListIds = strings[2].substring(1, strings[2].length() - 1).split(",");
            HashSet<Integer> sonList = new HashSet<>();
            for (String sonListId : sonListIds) {
                sonList.add(Integer.parseInt(sonListId));
            }
            arrayList.add(new B100_9_TreeNode(id, size, sonList));
        }
        System.out.println(SizeOfThisDir(N));


    }

    private static int SizeOfThisDir(int id){
        int ans = 0;
        for (B100_9_TreeNode node : arrayList) {
            if (node.getId() == id){
                ans += node.getSize();
                if (node.getSonList() == null){
                    return ans;
                }
                for (Integer num : node.getSonList()){
                    ans += SizeOfThisDir(num);
                }
            }
        }
        return ans;
    }
}
