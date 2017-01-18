package org.sang.bean;

/**
 * Created by sang on 17-1-17.
 */
public class Rice extends Food {
    //烹饪方法
    private String way;

    @Override
    public String toString() {
        return "Rice{" +
                "way='" + way + '\'' +
                ",name="+name+"}";
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }
}
