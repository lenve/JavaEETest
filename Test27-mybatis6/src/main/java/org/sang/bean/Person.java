package org.sang.bean;

import java.util.List;

/**
 * Created by sang on 17-1-16.
 */
public class Person {
    private Long id;
    private List<String> interest;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", interest=" + interest +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getInterest() {
        return interest;
    }

    public void setInterest(List<String> interest) {
        this.interest = interest;
    }
}
