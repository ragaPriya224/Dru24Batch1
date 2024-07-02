package drubatch.TwentyFour.batchOne.jdbcSpringDemo;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class CourseDao {

	JdbcTemplate jdbcTemplate;

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
	
	public List<Course> getList(){
		String sql = "SELECT course_id, title, description,link  FROM course";
		return jdbcTemplate.query(sql, rowMapper);
	}
	
	
	
	
}
