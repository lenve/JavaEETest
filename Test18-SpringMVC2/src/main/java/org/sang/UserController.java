package org.sang;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sang on 16-12-15.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //http://localhost:8080/user/
    @ResponseBody
    @RequestMapping(produces = "text/plain;charset=UTF-8")//produces描述的是响应的头信息的Content-Type字段
    public String user(HttpServletRequest request) {
        //url:http://localhost:8080/user can access
        return "url:" + request.getRequestURL() + " can access";
    }
    //http://localhost:8080/user/user/张三
    @ResponseBody
    @RequestMapping(value = "/user/{str}",produces = "text/plain;charset=UTF-8")
    public String pathVar(@PathVariable String str, HttpServletRequest request) {
        //url:http://localhost:8080/user/user/%E5%BC%A0%E4%B8%89 can access , str is 张三
        return "url:" + request.getRequestURL() + " can access , str is " + str;

    }

    //http://localhost:8080/user/rp?id=100
    @ResponseBody
    @RequestMapping(value = "/rp",produces = "text/plain;charset=UTF-8")
    public String requestParams(long id, HttpServletRequest request) {
        //url:http://localhost:8080/user/rp can access , username is :100
        return "url:" + request.getRequestURL() + " can access , username is :" + id;
    }

    //http://localhost:8080/user/json?username=%E5%BC%A0%E4%B8%89&password=123
    @ResponseBody
    @RequestMapping(value = "/json", produces = "application/json;charset=UTF-8")
    public String passObj(UserBean user, HttpServletRequest request) {
        Gson gson = new Gson();
        //{"username":"张三","password":"123"}
        return gson.toJson(user);
    }

    @ResponseBody
    @RequestMapping(value = "/getJson",produces = "application/json;charset=UTF-8")
    public UserBean passObj(UserBean userBean) {
        return userBean;
    }

    //http://localhost:8080/user/n1
    //http://localhost:8080/user/n2
    @ResponseBody
    @RequestMapping(value = {"/n1","/n2"},produces = "text/plain;charset=UTF-8")
    public String group() {
        //不同路径定位到同一方法
        return "不同路径定位到同一方法";
    }

}
