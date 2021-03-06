package org.example.creditcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class);
        System.out.println("Hello world");
    }

    @Bean
    NameProvider createNameProvider() {
        return new NameProvider();
    }
}
