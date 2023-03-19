package ocf.api.google.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "ocf.*")
@EnableAspectJAutoProxy
public class GoogleBookstoreMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleBookstoreMainApplication.class, args);
	}

}
