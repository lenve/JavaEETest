package org.sang;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by sang on 2017/1/10.
 */
@Entity
public class SysRole {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
