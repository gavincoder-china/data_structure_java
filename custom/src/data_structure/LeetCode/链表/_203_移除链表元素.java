package data_structure.LeetCode.链表; /**
 * @Author: GavinCoder
 * @Date: 2020/6/8 8:32 上午
 */

/**
 * **********************************************************
 *
 * @Project: https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-06-08 08:32
 * @description:
 ************************************************************/
public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {


        if (head == null || (head.val == val && head.next == null)) {
            return null;
        }

        ListNode pointer = new ListNode(-1);
        pointer.next = head;
        ListNode cur = pointer;
        while (cur.next != null) {

            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return pointer.next;
    }


}
