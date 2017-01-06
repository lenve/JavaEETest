package org.sang;

/**
 * Created by sang on 17-1-6.
 */
public interface DemoService {
    public Person save(Person person);

    public void remove(Long id);

    public Person findOne(Person person);
}
