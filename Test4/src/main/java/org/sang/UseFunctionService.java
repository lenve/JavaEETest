package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sang on 16-12-12.
 */
//@Service//效果等同于如下几种
//    @Component
//    @Repository
    @Controller
public class UseFunctionService {
//    @Resource
    @Autowired
    FunctionService functionService;
    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
