package com.voicecyber.memento.simple;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Sean on 2018/10/26
 *备忘录模式发起者  简单模式编写
 * @author Sean
 */
public class Originator implements Cloneable {
    private String name;
    private String sex;
    private Integer age;

    @Override
    protected Object clone() {
        Originator originator=null;
        try {
            originator= (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return originator;
    }

    public Memento createMemento(){
        return new Memento<>(this.clone());
    }

    /**
     * 需要说明的是 ，下面的赋值方法实际并不是最佳的选择，因为对于不同的类需要做不同的选择
     * @param memento
     */
    public void restoreMemento(Memento memento){
        Originator originator = (Originator) memento.getState();
        this.setName(originator.getName());
        this.setSex(originator.getSex());
        this.setAge(originator.getAge());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
    //    public void test(Object bean) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
//        BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
//        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
//        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
//           //属性名称
//            String name = propertyDescriptor.getName();
//            // 读取属性方法
//            Method readMethod = propertyDescriptor.getReadMethod();
//            Method writeMethod = propertyDescriptor.getWriteMethod();
//            if ()
//
//
//        }
//    }
}
