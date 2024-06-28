package demo.practice.configurationsDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@Value("${my.greeting : novaluepresent}")
	private String greetingMessage;
	
	@GetMapping("/team")
	public String m1() {
		return greetingMessage;
	}
}
