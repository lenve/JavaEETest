package org.sang;

import org.springframework.context.ApplicationEvent;

/**
 * Created by sang on 16-12-13.
 */
public class DemoEvent extends ApplicationEvent{
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
