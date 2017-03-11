package org.sang.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sang on 17-3-10.
 */
public class LoginInterceptors implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        httpServletRequest.setCharacterEncoding("UTF-8");
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        if (requestURL.toString().contains("sang")&&!requestURL.toString().contains("sang/login")&&!requestURL.toString().contains("sang/dologin")) {
            Object user = httpServletRequest.getSession().getAttribute("user");
            if (user == null) {
                httpServletResponse.sendRedirect("/sang/login");
                return false;
            } else {
                return true;
            }
        }else{
            return true;
        }
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
