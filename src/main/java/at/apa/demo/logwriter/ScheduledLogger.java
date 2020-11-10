package at.apa.demo.logwriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledLogger {

  private static final Logger log = LoggerFactory.getLogger(ScheduledLogger.class);

  @Scheduled(fixedDelay = 1000)
  public void logMillis() {
    log.info("current time: {}", System.currentTimeMillis());
  }
}
