package org.sang;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by sang on 16-12-12.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(org.sang.Action)")
    public void annotationPointCut() {

    }

    //after表示先执行方法，后拦截，before表示先拦截，后执行方法
//    @Before("annotationPointCut()")
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截:"+action.name());
    }

    /**
     * 第一个星号表示返回类型，×表示所有类型，注意第一个星号和包名之间有空格
     * 后面的星号表示任意字符
     * 两个点表示任意个参数
     *
     * 参考  http://www.cnblogs.com/yansum/p/5898412.html
     * @param joinPoint
     */
    @Before("execution(* org.sang.MethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截："+method.getName());
    }
}
