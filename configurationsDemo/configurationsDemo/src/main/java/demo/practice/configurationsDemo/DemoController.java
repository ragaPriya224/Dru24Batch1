package demo.practice.configurationsDemo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	DbConfigs config;
	
	@Value("${my.greeting}")
	private String greetingMessage;
	
	@Autowired
	private Environment envi;

	@Value("${my.list.values}")
	private List<String> welcomeValues;
	
	@Value("#{${dbValues}}")
	private Map<String,String> dbDetails;
	
	@GetMapping("/team")
	public String m1() {
		return greetingMessage;
//		return config.getConnection();
	}
	@GetMapping("/team1")
	public List<String> m2() {
		System.out.println(dbDetails);
		return welcomeValues;
	}
	@GetMapping("/envidetails")
	public String m3() {
		return envi.toString();
	}
	
}
