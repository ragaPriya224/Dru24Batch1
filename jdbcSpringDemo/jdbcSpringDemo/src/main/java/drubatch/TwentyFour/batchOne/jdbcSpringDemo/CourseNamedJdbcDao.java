package drubatch.TwentyFour.batchOne.jdbcSpringDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;


@Component
public class CourseNamedJdbcDao {
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	private static final Logger log = LoggerFactory.getLogger(CourseDao.class);
	public CourseNamedJdbcDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	
	public String getTitle() {
		String sql = "SELECT title FROM course WHERE course_id = :courseId";
		Course course = new Course();
		course.setCourseId(2);
		SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(course);
		return namedParameterJdbcTemplate.queryForObject(sql, namedParameters, String.class);
	}
}