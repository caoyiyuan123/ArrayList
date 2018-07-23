package com.baidu.arrayList;


/**
 * 手写ArrayList集合
 */
public class ExaArrayList {
    //ArrayList底层采用数组存放
    private Object[] elementData;

    //默认数组的容量为10
    private static final int DEFAULT_CAPACITY = 10;

    //记录数组的实际大小
    private int size;

    /**
     * 指定数组的初始大小
     * @param initialCapacity
     */
    public ExaArrayList(int initialCapacity) {
        //对数组elementData进行初始化
        if (initialCapacity<0) {
            throw new IllegalArgumentException("初始容量大小不能小于0");
        }
        elementData = new Object[initialCapacity];
    }

    /**
     * 默认数组的初始容量为10
     */
    public ExaArrayList(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * ArrayList中的add方法
     * @param object
     */
    public void add(Object object){
        //判断实际存放的数据容量是否大于elementData
        if(size == elementData.length){
            /**更新数组容量的大小*/
            int newCapacity = size * 2;
            /**创建一个新的数组*/
            Object[] newObject = new Object[newCapacity];
            /**遍历旧数组*/
            for (int i=0;i<elementData.length;i++){
                /**将旧数组的值赋给新数组*/
                newObject[i] = elementData[i];
            }
            /**更新数组*/
            elementData = newObject;
        }
        //2.使用下标进行赋值
        elementData[size++] = object;
    }

    //使用下标获取元素
    public Object get(int index){
        rangeCheck(index);
        return elementData[index];
    }

    /**判断索引是否越界*/
    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("越界楼,客官你再看看吧");
    }

    /**根据下标删除元素*/
    public Object remove(int index){
        //1.判断索引是否越界
        rangeCheck(index);
        //2.获取旧数组的value值
        Object oldValue = elementData[index];
        //3.需要移动元素的个数
        int numMoved = size - index - 1;
        //4.进行元素的复制
        if(numMoved>0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
            elementData[--size] = null;
        }
            return oldValue;
    }

}
