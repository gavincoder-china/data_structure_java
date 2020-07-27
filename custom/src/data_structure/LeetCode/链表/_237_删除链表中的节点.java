package data_structure.LeetCode.链表; /**
 * @Author: GavinCoder
 * @Date: 2020/6/7 4:20 下午
 */

/**
 * **********************************************************
 *
 * @Project: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-06-07 16:20
 * @description:
 ************************************************************/
public class _237_删除链表中的节点 {
    public void deleteNode(ListNode node) {

        if (node.next == null) {
            node = null;

        } else {
            node.val = node.next.val;
            node.next = node.next.next;
        }

    }
}
