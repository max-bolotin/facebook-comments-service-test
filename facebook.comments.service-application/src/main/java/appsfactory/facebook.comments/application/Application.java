package appsfactory.facebook.comments.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("appsfactory.facebook.comments")
@EntityScan("appsfactory.facebook.comments")
@SpringBootApplication
@EnableJpaRepositories("appsfactory.facebook.comments")
public class Application {

  public static void main(String[] args) {

    SpringApplication.run(Application.class, args);
  }

}
