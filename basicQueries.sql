-- #BASIC QUERIES

create table dummy_table(name varchar(20),address text,age int); --CREATE TABLE

-- insert datas
insert into dummy_table values('XYZ','location-A',25);

insert into dummy_table values('ABC','location-B',35);

insert into dummy_table values('DEF','location-C',40);
        
insert into dummy_table values('PQR','location-D',54);

-- The SELECT command (when used without the optional WHERE condition) is used to fetch all data from a database table
SELECT* FROM dummy_table;

--UPDATE is used to make updates to the data or row(s) of a database table. In the example below we use UPDATE to change the age of a person whose name is ‘PQR’:
update dummy_table set age=25 where name='PQKJKJKR';
select * from dummy_table;   

update dummy_table set name='GHI',age=54 where address='location-D';

CREATE TABLE COMPANY(
   ID INT PRIMARY KEY     NOT NULL,
   NAME           TEXT    NOT NULL,
   AGE            INT     NOT NULL,
   ADDRESS        CHAR(50),
   SALARY         REAL
);
CREATE TABLE DEPARTMENT(
   ID INT PRIMARY KEY      NOT NULL,
   DEPT           CHAR(50) NOT NULL,
   EMP_ID         INT      NOT NULL
);


select * from dummy_table;
INSERT INTO dummy_table values('abcdef','add',44);
select length(name) from dummy_table;
select * from dummy_table limit 3;

select * from dummy_table where name like 'abc%';
select * from dummy_table where name ilike 'abc%';


-- pseudo table

select * from company;
INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) VALUES (1, 'Paul', 32, 'California', 20000.00);
INSERT INTO company VALUES(3,'anuhya',22,'hyderabad',20000.00);

-- syntax for creating view 
-- CREATE [TEMP | TEMPORARY] VIEW view_name AS
-- SELECT column1, column2.....
-- FROM table_name
-- WHERE [condition];

 CREATE  VIEW company_view AS
SELECT id,name,age
FROM company;

select * from company_view;

drop view company_view;
-- function
 -- function concept
-- CREATE [OR REPLACE] FUNCTION function_name (arguments) 
-- RETURNS return_datatype AS $variable_name$
--    DECLARE
--       declaration;
--       [...]
--    BEGIN
--       < function_body >
--       [...]
--       RETURN { variable_name | value }
--    END; LANGUAGE plpgsql;
-- INSERT INTO COMPANY(ID,NAME,AGE,ADDRESS,SALARY) VALUES (55, 'uma', 556, 'hyd', 200.00);
-- INSERT INTO COMPANY VALUES(2,"RAJU",24,"UK",20000);
INSERT INTO company values(44,'john',23,'hyderabad',50);

select * from company;
							
							
							
CREATE  FUNCTION totalRecords() 
RETURNS integer AS $totalNumber$
   DECLARE
    totalNumber integer;
   BEGIN
     select  count(*) into totalNumber FROM company;
      RETURN  totalNumber;
   END;
   $totalNumber$ LANGUAGE plpgsql;
   
 select totalRecords();
