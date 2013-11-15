-- You can use this file to load seed data into the database using SQL statements
insert into User (id, email, password, active) values (0, 'john.smith@mailinator.com', '2125551212', 1);

SET @lastid2 = LAST_INSERT_ID();

insert into user_profile(id,  userid, name, active) values(0, @lastid2, 'test', 1);
insert into user_profile(id,  userid, name, active) values(1, @lastid2, 'test2', 1);
insert into user_profile(id,  userid, name, active) values(2, @lastid2, 'test3', 1);
insert into user_profile(id,  userid, name, active) values(3, @lastid2, 'test4', 1);

