package com.baseapp.BaseApp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Base App Project",
				version = "1.0.0",
				description = "This project is only for researching",
				termsOfService = "base app for researching",
				contact = @Contact(
							name = "Base App",
							email = "baseapp@baseappmail.com"
				),
				license = @License(
						name = "licence",
						url = "baseapp"
				)
		)
)
public class BaseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseAppApplication.class, args);
	}

}
