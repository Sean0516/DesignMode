package com.voicecyber.handler;

/**
 * Created by Sean on 2018/7/5
 *责任链
 * @author Sean
 */
public abstract class Handler {
    private Handler nextHandler;
    public final String handlerMessage(String request,int level){
        String response=null;
        if (level==this.getHandlerLevel()){
             response = this.getResponse(request);
        }else {
            if (nextHandler!=null){
              response=  this.nextHandler.handlerMessage(request,level);
            }else {
                System.out.println("无处理器可使用");
            }
        }
        return response;
    }
    public void setNext(Handler handler){
        this.nextHandler=handler;
    }
    protected abstract int getHandlerLevel();
    protected abstract String  getResponse(String request);

}
