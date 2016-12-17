package org.sang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sang on 16-12-16.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello/{str}")
    public String hello(@PathVariable String str, HttpServletRequest request) {
        System.out.println(str);
        return "index";
    }

    @RequestMapping("/user")
    public String user(@ModelAttribute("msg") String msg, UserBean userBean) {
        System.out.println("username is :" + userBean.getUsername() + ";and id is :" + userBean.getId());
        throw new IllegalArgumentException("抱歉，参数异常/ 来自@ModelAttribute:" + msg);
    }
}
