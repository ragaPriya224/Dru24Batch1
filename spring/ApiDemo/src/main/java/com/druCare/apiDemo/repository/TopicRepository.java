package com.druCare.apiDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.druCare.apiDemo.entity.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String>{
// jpql, native query 
	//native sql query
	@Query(value = "select * from Topic where contents like concat('%',:query,'%')",nativeQuery = true)
	List<Topic> searchTopic(String query);
	
	//jpql
	@Query(value = "select t from Topic t where t.contents like concat('%',:query,'%')")
	List<Topic> searchTopicDemo(String query);
	
	
}
