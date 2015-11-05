package br.com.recursive.exemplo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class Loader {

    public static void main(String[] args) {
        SpringApplication.run(Loader.class, args);
    }
    
}
