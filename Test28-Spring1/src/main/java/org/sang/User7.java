package org.sang;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by sang on 17-2-20.
 */
public class User7 {
    private String[] names;
    private List<String> list;
    private Map<String, String> map;
    private Properties properties;

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    public void test() {
        StringBuffer sb1 = new StringBuffer();
        for (String name : names) {
            sb1.append(name).append(",");
        }
        StringBuffer sb2 = new StringBuffer();
        for (String s : list) {
            sb2.append(s).append(",");
        }
        StringBuffer sb3 = new StringBuffer();
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            sb3.append("key:" + s + ";value:" + map.get(s)).append(",");
        }
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
        System.out.println(properties.getProperty("username"));
    }
}
