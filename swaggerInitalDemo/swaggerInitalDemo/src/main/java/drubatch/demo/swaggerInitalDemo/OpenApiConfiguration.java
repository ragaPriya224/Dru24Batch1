package drubatch.demo.swaggerInitalDemo;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfiguration {
	
	@Bean
	public OpenAPI defineOpenApi() {
		Server server = new Server();
		server.setUrl("http://localhost:8080");
		server.setDescription("demopurpose");
		
		Contact contact = new Contact();
		contact.setName("raga priya");
		contact.setEmail("dummyemail.com");
		
		Info information = new Info()
				.title("Employee management api")
				.version("1.0")
				.description("expose endpoints to manage employees")
				.contact(contact);
		
		return new OpenAPI().info(information).servers(List.of(server));
	}

}
