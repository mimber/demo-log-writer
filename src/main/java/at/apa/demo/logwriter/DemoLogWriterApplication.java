package at.apa.demo.logwriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoLogWriterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLogWriterApplication.class, args);
	}

}
