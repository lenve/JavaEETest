package org.sang;

import java.lang.annotation.*;

/**
 * Created by sang on 16-12-12.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
