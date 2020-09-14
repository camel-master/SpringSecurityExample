package me.dave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication();
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(Application.class, args);
    }
}
