package org.sang;

/**
 * Created by sang on 16-12-19.
 */
public class HelloService {
    private String msg;
    public String sayHello(){
        return "hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
