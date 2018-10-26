package com.voicecyber.memento.simple;

import java.util.HashMap;

/**
 * Created by Sean on 2018/10/26
 *
 * @author Sean
 */
public class CaretakerById {
    private HashMap<String,Memento> mementoHashMap=new HashMap<>(10);
    public Memento getMemento(String id){
        return mementoHashMap.get(id);
    }
    public void setMemento(String id,Memento memento){
        //该if 判断只是一个简单的判断，实际上的逻辑应该是更复杂
        if (mementoHashMap.size()==10){
            mementoHashMap.clear();
        }
        mementoHashMap.put(id,memento);
    }
}
