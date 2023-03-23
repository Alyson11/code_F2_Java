package day10;

import java.util.LinkedList;

public class MyCollection {
    private LinkedList linkedList;

    public MyCollection(){
        linkedList = new LinkedList();
    }

    // 创建添加元素的方法
    public void myAdd(Object o){
        linkedList.add(o);
    }

    public Object myGet(){
        return linkedList.removeLast();
    }

    public int getLength(){
        return linkedList.size();
    }
}
