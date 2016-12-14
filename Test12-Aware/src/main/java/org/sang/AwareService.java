package org.sang;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by sang on 16-12-14.
 */
@Service
@PropertySource(value = "t.properties", encoding = "UTF-8")
public class AwareService implements BeanNameAware, BeanFactoryAware, ResourceLoaderAware, EnvironmentAware {
    private String beanName;
    private ResourceLoader loader;
    private Environment environment;

    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void output() {
        System.out.println("Bean的名称为：" + beanName);
        Resource resource = loader.getResource("t.txt");
        try {
            System.out.println(IOUtils.toString(resource.getInputStream(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(environment.getProperty("sang.username"));
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        //获取Bean的生成工厂
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
