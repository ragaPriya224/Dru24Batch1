package drubatch.TwentyFour.batchOne.jdbcSpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcSpringDemoApplication {

	private static CourseDao dao;
	public JdbcSpringDemoApplication(CourseDao dao) {
		this.dao = dao;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcSpringDemoApplication.class, args);
		System.out.println("*************");
		System.out.println(dao.getList());
	}
	

}
