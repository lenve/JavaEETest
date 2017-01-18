package org.sang.bean;

/**
 * Created by sang on 17-1-17.
 */
public class Alias {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Alias{" +
                "name='" + name + '\'' +
                '}';
    }

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
