package data_structure.链表;
/**
 * @Author: GavinCoder
 * @Date: 2020/6/7 2:40 下午
 */

/**
 * **********************************************************
 *
 * @Project: 自定义链表
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-06-07 14:40
 * @description:
 ************************************************************/
public class CustomLinkedList<E> {
    private Node<E>  first;
    private int size;


    private class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

}
