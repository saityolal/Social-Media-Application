-- This will only be executed in memory database


insert into user_details(id, birth_date, name)
values(10001, current_date(), 'john');
insert into user_details(id, birth_date, name)
values(10002, current_date(), 'mary');
insert into user_details(id, birth_date, name)
values(10003, current_date(), 'sam');


insert into post(id, definition, user_id)
values(20001, 'new profile picture', 10001);
insert into post(id, definition, user_id)
values(20002, 'new profile picture_2', 10001);
insert into post(id, definition, user_id)
values(20003, 'new profile picture_3', 10001);