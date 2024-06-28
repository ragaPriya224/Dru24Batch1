package demo.practice.configurationsDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@Value("${my.greeting : novaluepresent}")
	private String greetingMessage;
	

	@Value("${my.list.values}")
	private List<String> welcomeValues;
	
	@GetMapping("/team")
	public String m1() {
		return greetingMessage;
	}
	@GetMapping("/team1")
	public List<String> m2() {
		return welcomeValues;
	}
}
