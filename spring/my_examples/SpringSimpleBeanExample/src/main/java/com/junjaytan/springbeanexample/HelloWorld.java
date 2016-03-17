package com.junjaytan.springbeanexample;

/**
 * Created by junjaytan on 3/7/16.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message : " + message);
    }
}
