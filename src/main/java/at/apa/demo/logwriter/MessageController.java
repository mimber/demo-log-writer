package at.apa.demo.logwriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  private static final Logger log = LoggerFactory.getLogger(MessageController.class);

  @PostMapping("/messages")
  public void log(@RequestBody String message) {
    log.info(message);
  }
}
