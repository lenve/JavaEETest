package org.sang;

import org.springframework.stereotype.Service;

/**
 * Created by sang on 16-12-12.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "你好" + word + "!";
    }
}
