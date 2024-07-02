CREATE TABLE course(
course_id integer NOT NULL,
title varchar(50)  NOT NULL,
description varchar(100) NOT NULL,
link varchar(255) NOT NULL,
CONSTRAINT pk_course_course_id  primary key (course_id)
);


INSERT INTO course
VALUES(11,"Java","Learning java","java.com");
INSERT INTO COURSE(course_id,title,description,link)
VALUES(1,"JAVA","I am learning java","https://meet.google.com/vra-kwwf-gjj");

INSERT INTO drubatch1.course (course_id, title, description, link)
VALUES (4, 'Introduction to Programming', 'basics of programming', 'http://example.com/intro-to-programming'),
(2, 'Database', 'database architectures and designs', 'http://example.com/advanced-db-systems'),
(3, 'Python', 'Build web applications using Python', 'http://example.com/web-dev-python');