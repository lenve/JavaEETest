package org.sang.bean;

import java.util.List;

/**
 * Created by sang on 17-1-17.
 */
public class Province {
    private Long id;
    private String name;
    private Alias alias;
    private List<City> cities;
    private List<Food> foods;

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", foods='" + foods + '\'' +
                ", alias=" + alias +
                ", cities=" + cities +
                ", name=" + name+
                '}';
    }

    public Alias getAlias() {
        return alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
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
