package ink.pwr.springboot32withjava21demo.microservice.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;

// import org.springframework.scheduling.annotation.EnableAsync;

// @EnableAsync
@EnableCaching
@ConfigurationPropertiesScan
@SpringBootApplication
public class ApiApplication {
  public static void main(String[] args) {
    SpringApplication.run(ApiApplication.class, args);
  }
}
