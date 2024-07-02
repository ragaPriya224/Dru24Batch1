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
		System.out.println(dao.getCourseList());
		System.out.println("******get particular data*******");
		System.out.println(dao.getCourse(1));
		System.out.println("******create  data*******");
		Course c = new Course(22,"english","spoken class for formal","www.dummy");
		dao.create(c);
		System.out.println("******update  data*******");
		Course c1 = new Course(4,"updated","upd desfcription","www.upddummy");
		dao.update(c1, 4);
		System.out.println("********************delete");
		dao.delCourse(3);
	}
	

}
