package drubatch.TwentyFour.batchOne.jdbcSpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcSpringDemoApplication {

//	private static CourseDao dao;
//	public JdbcSpringDemoApplication(CourseDao dao) {
//		this.dao = dao;
//	}
	private static CourseNamedJdbcDao namedJdbcDao;
	public JdbcSpringDemoApplication(CourseNamedJdbcDao namedJdbcDao) {
		this.namedJdbcDao = namedJdbcDao;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcSpringDemoApplication.class, args);
//		System.out.println("*************");
//		System.out.println(dao.getCourseList());
//		System.out.println("******get particular data*******");
//		System.out.println(dao.getCourse(1));
//		System.out.println("******create  data*******");
//		Course c = new Course(22,"english","spoken class for formal","www.dummy");
//		dao.create(c);
//		System.out.println("******update  data*******");
//		Course c1 = new Course(4,"updated","upd desfcription","www.upddummy");
//		dao.update(c1, 4);
//		System.out.println("********************delete");
//		dao.delCourse(3);
		System.out.println("*************");
		System.out.println(namedJdbcDao.getTitle());
		System.out.println("****title *********");
		System.out.println(namedJdbcDao.getCourseTitle());
		
	}
	

}
