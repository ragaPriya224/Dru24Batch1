package drubatch.TwentyFour.batchOne.jdbcSpringDemo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class CourseDao {

	JdbcTemplate jdbcTemplate;
	private static final Logger log = LoggerFactory.getLogger(CourseDao.class);
	public CourseDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	RowMapper<Course> rowMapper = (rs,rowNum) ->{
		Course course = new Course();
		course.setCourseId(rs.getInt("course_id"));
		course.setDescription(rs.getString("description"));
		course.setTitle(rs.getString("title"));
		course.setLink(rs.getString("link"));
		return course;
	};
	
	public List<Course> getCourseList(){
		String sql = "SELECT course_id, title, description,link  FROM course";
		return jdbcTemplate.query(sql, rowMapper);
	}
	public void create(Course course) {
		String sql = "INSERT INTO course values(?,?,?,?)";
		int output = jdbcTemplate.update(sql,course.getCourseId(),course.getTitle(),
				course.getDescription(),course.getLink());
		if(output == 1) {
			log.info("new course is created");
		}
	}
	
	public void update(Course course,int id) {
		String sql = "UPDATE  course SET title = ?,description=? where course_id = ?";
		int output = jdbcTemplate.update(sql,course.getTitle(),
				course.getDescription(),course.getCourseId());
		if(output == 1) {
			log.info("updated  course ");
		}
	}
	public Course getCourse(int id){
		String sql = "SELECT course_id, title, description,link  FROM course where course_id = ?";
		return jdbcTemplate.queryForObject(sql, rowMapper,new Object[] {id});
	}
	
	public void delCourse(int id){
		String sql = "DELETE FROM course where course_id = ?";
		int output =  jdbcTemplate.update(sql,id);
		if(output == 1) {
			log.info("deleted  course ");
		}
	}
	
}
