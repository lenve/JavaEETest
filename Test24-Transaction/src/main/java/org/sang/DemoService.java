package org.sang;

/**
 * Created by sang on 2017/1/5.
 */
public interface DemoService {
    public Person savePersonWithRollBack(Person person);

    public Person savePersonWithoutRollBack(Person person);
}
