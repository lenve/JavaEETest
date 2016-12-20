package org.sang;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by sang on 16-12-19.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
