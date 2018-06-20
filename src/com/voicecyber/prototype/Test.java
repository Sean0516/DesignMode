package com.voicecyber.prototype;

/**
 * Created by Sean on 2018/6/20
 *
 * @author Sean
 */
public class Test {
    public static void main(String[] args) {
        Mail mail=new Mail(new AdvTemplate());
        for (int i = 0; i <5 ; i++) {
            Mail cloneMail= (Mail) mail.clone();
            cloneMail.setReceiver("test"+i);
            cloneMail.setName("sean"+i);
            sendMail(cloneMail);
        }
    }
    public static void sendMail(Mail mail){
        System.out.println(mail.getSubject()+"___"+mail.getContext() +" 收件人："+mail.getReceiver()+"  name："+mail.getName());
    }
}
