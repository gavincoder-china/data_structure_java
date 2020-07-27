package data_structure.LeetCode.链表; /**
 * @Author: GavinCoder
 * @Date: 2020/6/7 4:43 下午
 */

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-06-07 16:43
 * @description:
 ************************************************************/
public class _141_环形链表 {
    //快慢指针写法
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    //内存解法
    public boolean hasCycle2(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode temp = null;
        while (head.next != null) {

            if (head.next == head) {
                return true;
            } else {
                temp = head.next;
                head.next = head;
                head = temp;
            }
        }
        return false;

    }

}
