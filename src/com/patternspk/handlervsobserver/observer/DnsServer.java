package com.patternspk.handlervsobserver.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sean on 2018/11/8
 *
 * @author Sean
 */
public abstract class DnsServer  extends Observable implements Observer {
    @Override
    public void update(Observable o, Object arg) {

        if (isLocal(arg.toString())){
            System.out.println("匹配到当前ip ，当前后缀为:" +arg.toString());
        }else {
            responesFromUpperServer(arg.toString());
        }
        sign(arg.toString());

    }
    public void setUpperServer(DnsServer dnsServer){
        super.deleteObservers();
        super.addObserver(dnsServer);
    }
    private void responesFromUpperServer(String msg){
        super.setChanged();
        super.notifyObservers(msg);
    }
    protected  abstract void sign(String msg);
    protected abstract boolean isLocal(String msg);

}
