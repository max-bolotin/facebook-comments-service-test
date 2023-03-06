package appsfactory.facebook.comments.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.info.BuildProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;


@Import({BuildProperties.class})
@SpringBootConfiguration
@SpringBootTest
class ControllerTests {

  @Test
  void contextLoads() {
  }

}
