package April20_2023;

import tools.ListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ51 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int len = Integer.parseInt(input);
            String[] values = br.readLine().split(" ");
            int[] nums = new int[len];
            for (int i = 0; i < values.length; i++) {
                nums[i] = Integer.parseInt(values[i]);
            }

            //生成链表
            ListNode head = creatListNode(nums);

            int k = Integer.parseInt(br.readLine());
            //双指针法寻找倒数第k个节点的值
            System.out.println(valueOfLastKthNode(head, k));
        }

    }

    //构建输出链表倒数第k个节点的值方法
    public static int valueOfLastKthNode(ListNode head, int k) {
        ListNode fast = head, slow = head;
        while (--k > 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    //构造链表方法
    public static ListNode creatListNode(int[] nums) {
        if (nums.length == 1) return new ListNode(nums[0]);

        ListNode head = new ListNode(nums[0]);
        ListNode curr = head;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }

        return head;
    }
}
