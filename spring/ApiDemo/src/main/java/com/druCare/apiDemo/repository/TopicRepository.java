package com.druCare.apiDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.druCare.apiDemo.entity.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String>{

}
