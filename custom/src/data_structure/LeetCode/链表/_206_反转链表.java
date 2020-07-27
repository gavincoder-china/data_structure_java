package data_structure.LeetCode.链表; /**
 * @Author: GavinCoder
 * @Date: 2020/6/7 4:25 下午
 */

/**
 * **********************************************************
 *
 * @Project:
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-06-07 16:25
 * @description:
 ************************************************************/
public class _206_反转链表 {
    //迭代
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode temp = null;
        while (head != null) {
            temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }

    //递归
    public ListNode reverseList2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList2(head.next);
        head.next.next=head;
        head.next=null;
        return node;

    }
}
