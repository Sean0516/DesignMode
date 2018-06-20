package com.voicecyber.prototype.kaobei;

import java.util.ArrayList;

/**
 * Created by Sean on 2018/6/20
 * 深拷贝
 * @author Sean
 */
public class Result implements Cloneable {
    private String name;
    private ArrayList<String> list=new ArrayList<>();

    @Override
    protected Object clone() {
        Result result=null;
        try {
            result= (Result) super.clone();
            this.list= (ArrayList<String>) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        Result result=new Result();
        result.setName("test");
        strings.add("sss");
        result.setList(strings);
        Result result1= (Result) result.clone();
        strings.add("aaaa");
        result1.setList(strings);
        System.out.println(result);
    }
}
