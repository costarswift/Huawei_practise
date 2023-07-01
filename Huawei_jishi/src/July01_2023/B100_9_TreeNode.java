package July01_2023;

import java.util.HashSet;

/**
 * @Project_Name Huawei_practise
 * @Author Costar
 * @Date 2023-07-01 下午 2:53
 * @Description todo
 */
public class B100_9_TreeNode {
    //目录id
    private int id;
    //目录大小
    private int size;
    //子目录id列表
    private HashSet<Integer> sonList;

    public B100_9_TreeNode() {
    }

    public B100_9_TreeNode(int id, int size, HashSet<Integer> sonList) {
        this.id = id;
        this.size = size;
        this.sonList = sonList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public HashSet<Integer> getSonList() {
        return sonList;
    }

    public void setSonList(HashSet<Integer> sonList) {
        this.sonList = sonList;
    }
}
