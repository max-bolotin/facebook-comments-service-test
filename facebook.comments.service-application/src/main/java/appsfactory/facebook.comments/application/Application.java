package appsfactory.facebook.comments.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("appsfactory.facebook.comments")
@SpringBootApplication
@EnableJpaRepositories
public class Application {

  public static void main(String[] args) {

    SpringApplication.run(Application.class, args);
  }

}
