package com.voicecyber.prototype;

/**
 * Created by Sean on 2018/6/20
 *
 * @author Sean
 */
public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String context;
    private String name;
    public Mail(AdvTemplate advTemplate){
        this.context=advTemplate.getContent();
        this.subject=advTemplate.getSubject();
    }
    @Override
    protected Object clone()  {
        Mail mail=null;
        try {
            mail= (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
