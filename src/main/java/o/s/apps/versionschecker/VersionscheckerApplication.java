package o.s.apps.versionschecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class VersionscheckerApplication {
	public static void main(String[] args) {
		SpringApplication.run(VersionscheckerApplication.class, args);
	}
}
