create table user_login( user_id int primary key , user_name varchar(255),email_id varchar(255),password varchar(255),role varchar(20));

#student stud
create table student_login(stud_id int primary key, user_id int , stud_first_name varchar(255), stud_last_name varchar(255), stud_city varchar(255),stud_state varchar(255), stud_qualification varchar(255), stud_entrance_exam varchar(255),stud_exam_score float,foreign key(user_id) references user_login(user_id));

#university uni
create table university(uni_id int primary key ,uni_name varchar(255),uni_rank int,uni_address longtext,uni_city varchar(255),uni_state varchar(255),uni_description longtext,uni_img longtext);

#college  clg
create table college(clg_id int primary key ,uni_id int ,clg_name varchar(255),clg_address longtext,clg_city varchar(255),clg_state varchar(255),clg_website varchar(255),clg_description longtext,clg_img longtext, foreign key(uni_id) references university(uni_id));

#stream strm
create table stream(strm_id int primary key ,strm_name varchar(255),strm_scope longtext);

#branch brch 
create table branch(brch_id int primary key,brch_name varchar(255),strm_id int , brch_duration varchar(255),foreign key(strm_id) references stream(strm_id));


#ranking rnk
create table ranking(rnk_id int primary key ,clg_id int,strm_id int, nirf_rank int,foreign key(strm_id) references stream(strm_id),foreign key(clg_id) references college(clg_id));


#intake_vacancy inv
create table intake_vacancy(invc_id int primary key ,clg_id int ,strm_id int ,brch_id int ,invc_seats int,invc_fee varchar(255),invc_documents varchar(255),invc_vacancy int,foreign key(clg_id) references college(clg_id),foreign key(brch_id) references branch(brch_id),foreign key(strm_id) references stream(strm_id));

#rank_predictor rapr
create table rank_predictor(rapr_id int primary key ,clg_id int ,strm_id int ,brch_id int ,rapr_entrance_exam varchar(255),rapr_y1 float,rapr_y2 float,rapr_y3 float,rapr_y4 float,rapr_y5 float,rapr_average float GENERATED ALWAYS as ((rapr_y1*0.2+rapr_y2*0.4+rapr_y3*0.6+rapr_y4*0.8+rapr_y5)/3),foreign key(clg_id) references college(clg_id),foreign key(brch_id) references branch(brch_id),foreign key(strm_id) references stream(strm_id));

#feedback feed
create table feedback(feed_id int primary key ,stud_id int,clg_id int ,feed_date datetime,feed_desc longtext,feed_rating int,foreign key(stud_id) references student_login(stud_id),foreign key(clg_id) references college(clg_id));

#event evt
create table event(evt_id int primary key  , evt_name longtext,evt_location varchar(255),evt_schedule_on datetime ,evt_description longtext,evt_organizer longtext);

#recruiters recu
create table recruiters(recu_id int primary key,recu_name varchar(255),recu_job_profile varchar(255),recu_job_desc longtext,recu_reg_date DATE,recu_end_date DATE,recu_link varchar(255));


#ApplicationFeedback appfeed
create table app_feedback(appfeed_id int primary key ,user_id int,appfeed_date datetime,appfeed_desc longtext,appfeed_rating int,foreign key(user_id) references user_login(user_id));

