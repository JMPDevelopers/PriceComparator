
alter table 
   USER_DATA
drop column   CREATION_DATE ;

insert into USER_DATA(ID, CREATION_DATE, First_Name, Last_Name, EMAIL)
values ('2', TO_DATE('2015/05/15 8:30:25', 'YYYY/MM/DD HH:MI:SS'),'Jason',    'Martin','jaro@gmail.com');

drop table users;
DROP TABLE users CASCADE CONSTRAINTS;