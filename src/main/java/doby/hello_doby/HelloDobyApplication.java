package doby.hello_doby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HelloDobyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDobyApplication.class, args);
	}

}
