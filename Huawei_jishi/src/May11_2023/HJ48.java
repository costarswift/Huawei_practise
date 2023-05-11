package May11_2023;

import tools.ListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ48 {
    public static ListNode listNode = new ListNode();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int[] nums = new int[strings.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }

        //生成链表
        listNode.val = nums[1];
        int n = nums[0];
        for (int i = 2; i < 2 * n; i += 2) {
            int insertValue = nums[i];
            int position = nums[i + 1];
            insert(insertValue, position);
        }

        delete(nums[nums.length - 1]);
        print(listNode);
    }

    private static void print(ListNode listNode) {
        ListNode tem = listNode;
        while (tem != null){
            System.out.print(tem.val + " ");
            tem = tem.next;
        }
    }

    private static void delete(int deleteValue) {
        if (listNode.val == deleteValue){
            listNode = new ListNode(listNode.next.val, listNode.next.next);
        }

        ListNode tem = listNode;
        while (tem.next != null && tem.next.val != deleteValue){
            tem = tem.next;
        }
        if (tem.next == null) return;
        tem.next = tem.next.next;
    }

    private static void insert(int insertValue, int position) {
        ListNode tem = listNode;
        while (tem.val != position){
            tem = tem.next;
        }

        ListNode tem_next = tem.next;
        tem.next = new ListNode(insertValue, tem_next);
    }
}
