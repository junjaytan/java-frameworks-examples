package com.junjaytan.batch; /**
 * Created by junjaytan on 3/18/16.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    @Value("${inFile}")
    public String inFile;

    @Value("${outFile}")
    public String outFile;

    public static void main(String[] args) {
        // TODO: verify that user specifies a valid inFile location and a valid outFile location

        ApplicationContext ctx = SpringApplication.run(Main.class, args);
    }

    @Bean
    public String blah() {
        System.out.println("inFile is: " + inFile);
        return null;
    };

    @Bean
    public String blah2() {
        System.out.println("outFile is: " + outFile);
        return null;
    }


}