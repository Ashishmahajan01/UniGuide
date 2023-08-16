#Database query for testing database

select * from college where uni_id=1;
select * from user_login where user_id=(select user_id from  app_feedback where appfeed_rating=4);
select * from user_login where user_id in(select user_id from  app_feedback where appfeed_rating=5);

select * from branch where strm_id =4;
select * from branch where strm_id =7;
select * from branch where strm_id =5;
select * from branch where brch_id =(select strm_id from stream where strm_name ='bfd');
select * from event where evt_name="multicon";

select * from intake_vacancy group by brch_id order by invc_vacancy;
select * from intake_vacancy group by brch_id order by invc_vacancy desc;

select * from ranking order by strm_id;
select * ,count(*) count from ranking group by strm_id;
select * from recruiters where recu_job_profile='analyst';
select * from user_login where role= 'student';
select * from user_login where role= 'hr';
select * from user_login where role= 'admin';
select * from user_login where user_id=(select user_id from student_login where stud_exam_score =100);

