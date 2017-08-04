package o.s.apps.versionschecker;

import o.s.apps.versionschecker.model.MyCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(includeFilters = @ComponentScan.Filter(MyCheck.class))
public class VersionscheckerApplication {
	public static void main(String[] args) {
		SpringApplication.run(VersionscheckerApplication.class, args);
	}
}
