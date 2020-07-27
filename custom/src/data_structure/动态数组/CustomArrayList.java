package data_structure.动态数组; /**
 * @Author: GavinCoder
 * @Date: 2020/6/6 10:14 下午
 */


import java.util.Arrays;

/**
 * **********************************************************
 *
 * @Project: 自定义动态数组
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2020-06-06 22:14
 * @description:
 ************************************************************/
@SuppressWarnings("unchecked")
public class CustomArrayList<E> {


    /**
     * 数组内元素个数
     */
    private int size;

    /**
     * 初始化容量
     */
    private final static int DEFAULT_CAPACITY = 10;


    private E[] elementData;


    /**
     * 构造方法
     */
    public CustomArrayList(int capacity) {

        this.elementData = (capacity <= DEFAULT_CAPACITY) ? (E[]) new Object[DEFAULT_CAPACITY] : (E[]) new Object[capacity];

    }

    public CustomArrayList() {
        elementData = (E[]) new Object[DEFAULT_CAPACITY];
    }

    /**
     * 集合内元素个数
     */
    public int size() {
        return size;
    }

    /**
     * isEmpty
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * get(index)
     */
    public E get(int index) {
        checkRange(index);
        return elementData[index];
    }

    /**
     * 获取第一次出现的位置
     * indexOf()
     */
    public int indexOf(E element) {

        if (element == null) {

            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {

                if (element.equals(elementData[i])) {
                    return i;
                }
            }
        }

        //代表未找到
        return -1;
    }

    /**
     * contains
     */
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    /**
     * 替换
     * set(index,e)
     */
    public E set(int index, E element) {
        checkRange(index);

        E oldElement = elementData[index];
        elementData[index] = element;
        return oldElement;
    }

    /**
     * remove(index)
     */
    public E remove(int index) {

        checkRange(index);
        E oldElement = elementData[index];
        for (int i = index + 1; i < size; i++) {
            elementData[i - 1] = elementData[i];
        }
        elementData[--size] = null;
        return oldElement;
    }

    /**
     * remove(E)
     */
    public void remove(E element) {
        remove(indexOf(element));

    }

    /**
     * add(e)
     */
    public void add(E element) {
        enableCapacity();
        elementData[size++] = element;


    }

    /**
     * add(index,e)
     */
    public void add(int index, E element) {
        checkRangeForAdd(index);
        enableCapacity();
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = element;
        size++;

    }

    /**
     * clear
     */
    public void clear() {

        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }


    /**
     * 保证扩容
     */
    private void enableCapacity() {

        if (size + 1 > elementData.length) {

            E[] newElement = (E[]) new Object[(elementData.length + (elementData.length >> 1))];

            //系统级别数组拷贝
            System.arraycopy(elementData,0,newElement,0,size);

            elementData = newElement;
        }

    }


    /**
     * 检查index范围
     */
    private void checkRange(int index) {

        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("size:" + size + ",but index:" + index + ",it is out of range!");
        }
    }

    private void checkRangeForAdd(int index) {

        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("size:" + size + ",but index:" + index + ",it is out of range!");
        }
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
               "size=" + size +
               ", elementData=" + Arrays.toString(elementData) +
               '}';
    }
}
