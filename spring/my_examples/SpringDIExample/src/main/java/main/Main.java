package main;

/**
 * Created by junjaytan on 3/17/16.
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import testbean.MySpringBeanWithDependency;

/*
    This main class reads the spring configuration XML and starts the app
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanFactory factory = context;
        MySpringBeanWithDependency test = (MySpringBeanWithDependency) factory
                .getBean("mySpringBeanWithDependency");
        test.run();
    }

}
