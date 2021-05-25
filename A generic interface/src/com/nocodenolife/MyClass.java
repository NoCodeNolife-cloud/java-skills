package com.nocodenolife;

public class MyClass <T extends Comparable<T>> implements MinMax<T>{

    T[] vals;

    MyClass(T[]ob){

        vals=ob;
    }

    public T min(){

        T val=vals[0];
        // 从泛型对象数组中通过compareTo取出最小值
        for(int i=1;i<vals.length;++i){

            if(vals[i].compareTo(val)<0){
                val=vals[i];
            }
        }

        return val;
    }

    public T max(){

        T val=vals[0];
        // 从泛型对象数组中通过compareTo取出最大值
        for(int i=1;i<vals.length;++i){

            if(vals[i].compareTo(val)>0){

                return val;
            }
        }
        return val;
    }
}
