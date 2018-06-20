package com.voicecyber.prototype.kaobei;


import java.util.List;

/**
 * Created by Sean on 2018/6/20
 *这里实现的是浅拷贝
 * @author Sean
 */
public class Student implements Cloneable {

    private String name;
    private int age;
    private String sex;
    private List<String> arrayList;

    public List<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(List<String> arrayList) {
        this.arrayList = arrayList;
    }

    public Student(){
    }

    @Override
    protected Object clone()  {
        Student student=null;
        try {
            student= (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }

    public Student(String name, int age, String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
