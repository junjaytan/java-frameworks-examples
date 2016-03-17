package com.junjaytan.springbeanexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by junjaytan on 3/7/16.
 */
public class MainApp {
    public static void main(String[] args) {
        // uses Spring API to load beans configuration file. This
        // API takes care of creating and initializing all the objects (beans)
        // in the configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // This gets the required bean, using the bean ID to return a generic
        // object which can be casted to the actual object. Once you have
        // the object you can then use it to call any class method.
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
    }

}
