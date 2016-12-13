package org.sang;

import org.springframework.stereotype.Service;

/**
 * Created by sang on 16-12-12.
 */
@Service
public class AnnotationService {
    @Action(name = "add-1")
    public void add1() {
        System.out.println("add-1");
    }

    public void add2() {
        System.out.println("add-2");

    }

    @Action(name = "add-3")
    public void add3() {
        System.out.println("add-3");

    }

}
