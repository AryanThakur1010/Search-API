package com.Makersharks.SearchPage;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info= @Info(
			title = "Search Api Assignment",
				description = "A search api for Makersharks search page to search for buyers based on their customised requirements",
				contact = @Contact(
						name = "Aryan Thakur",
						email = "a.thakur1301@gmail.com",
						url="https://github.com/AryanThakur1010/Search-API.git"
				)
		),
		externalDocs =@ExternalDocumentation(
				description = "This API allows buyers to search for manufacturers based on customized requirements such as location, nature of business, and manufacturing processes.",
				url="https://github.com/AryanThakur1010/Search-API.git"

)

)

public class SearchPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchPageApplication.class, args);
	}

}
