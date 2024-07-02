CREATE TABLE course(
course_id integer NOT NULL,
title varchar(50)  NOT NULL,
description varchar(100) NOT NULL,
link varchar(255) NOT NULL,
CONSTRAINT pk_course_course_id  primary key (course_id)
);