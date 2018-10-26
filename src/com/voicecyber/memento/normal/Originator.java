package com.voicecyber.memento.normal;

/**
 * Created by Sean on 2018/10/26
 *
 * @author Sean
 */
public class Originator implements Cloneable {
    private String name;
    private String sex;


    public IMemento createMemento() {
        return new Memento(this.clone());
    }

    public void restoreMemento(IMemento iMemento) {
        Originator originator = (Originator) ((Memento) iMemento).getState();
        this.setName(originator.getName());
        this.setSex(originator.getSex());
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

    private class Memento<T> implements IMemento {
        private T state;

        private Memento(T state) {
            this.state = state;
        }

        private T getState() {
            return state;
        }

        public void setState(T state) {
            this.state = state;
        }
    }

    @Override
    protected Object clone() {
        Originator originator = null;
        try {
            originator = (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return originator;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
