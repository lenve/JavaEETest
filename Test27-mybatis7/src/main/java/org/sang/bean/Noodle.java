package org.sang.bean;

/**
 * Created by sang on 17-1-17.
 */
public class Noodle extends Food{
    //每天吃几次
    private int price;

    @Override
    public String toString() {
        return "Noodle{" +
                "price=" + price +
                ",name="+name+"}";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
