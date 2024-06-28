package demo.practice.configurationsDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/team")
	public String m1() {
		return "works";
	}
}
