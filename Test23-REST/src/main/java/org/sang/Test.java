package org.sang;

import java.util.Random;

/**
 * Created by sang on 2017/1/4.
 */
public class Test {
    public static void main(String[] args) {
        String[] addrss = new String[]{"西安", "北京", "郑州", "上海", "武汉", "长沙", "广州", "贵阳", "柳州", "咸阳", "蓝田", "渭南"};
        String[] names1 = new String[]{"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈"};
        String[] names2 = new String[]{"强", "亚", "哲", "凡", "路", "举", "昕", "科", "武", "田"};
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println("insert into person(address,name,age) values('" + addrss[random.nextInt(addrss.length)] + "','" + names1[random.nextInt(names1.length)]+ names2[random.nextInt(names2.length)] + "','" + (20 + random.nextInt(70)) + "');");
        }
    }
}
