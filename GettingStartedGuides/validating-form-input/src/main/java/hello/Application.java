package hello;

/**
 * Created by junjaytan on 11/19/15.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// To activate Spring MVC, you would normally add @EnableWebMvc to the Application class
// but spring boot's @SpringBootApplication already adds this annotation when
// it detects spring-webmvc on your classpath.
// This same annotation allows it to find the annotation @Controller class
// and its methods. The Thymeleaf config is also taken care of by @SpringBootApplication
// By default templates are located in the classpath under templates and resolved
// as views by stripping the .html suffix off the file name
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
