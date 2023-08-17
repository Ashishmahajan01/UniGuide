#event evt
create table event(evt_id int primary key  , evt_name longtext,evt_location varchar(255),evt_schedule_on datetime ,evt_description longtext,evt_organizer longtext);

insert into event values(1,"alumina meet 2023","pune",now(),"alumina meet 2023 ,student councelling ","jspm college thathawade");
insert into event values(2,"study masters","mumbai",now(),"study in USA fair and open networking in mumbai ","IIT bombay");
insert into event values(3,"Asia con","Pimpari-chinchwad",now(),"research guidance ","PCCOE");
insert into event values(4,"pune startup meet","pune-shivajinagar",DATE_ADD(now(), INTERVAL 10 DAY),"startup building and scalling D2C","COEP institute");
insert into event values(5,"multicon","navi mumbai",DATE_ADD(now(), INTERVAL 7 DAY),"english councelling","thakur college of engineering");



#recruiters recu
create table recruiters(recu_id int primary key,recu_name varchar(255),recu_job_profile varchar(255),recu_job_desc longtext,recu_reg_date DATE,recu_end_date DATE,recu_link varchar(255));

insert into recruiters values(1,"Opentext","ASE","minimun 1 year experience in mysql,sprintboot,react",now(),DATE_ADD(now(), INTERVAL 7 DAY),"https://www.freshersnow.com/opentext-recruitment/");
insert into recruiters values(2,"cognizant","Analyst","skills in mongodb,any programming language ,communication skill",now(),DATE_ADD(now(), INTERVAL 7 DAY),"https://www.freshersnow.com/cognizant-recruitment/");
insert into recruiters values(3,"Accenture","Adavace ASE","experties in Aws , cloud computing,J2EE",now(),DATE_ADD(now(), INTERVAL 7 DAY),"https://www.freshersnow.com/accenture-off-campus/");
insert into recruiters values(4,"TCS","Adavace ASE","skills in angular js,react,javascript",now(),DATE_ADD(now(), INTERVAL 7 DAY),"https://www.freshersnow.com/tcs-off-campus/");
insert into recruiters values(5,"wipro","Adviser","experiance 2-3 years in operational and supply chain management",now(),DATE_ADD(now(), INTERVAL 7 DAY),"https://www.freshersnow.com/wipro-recruitment/");



#ApplicationFeedback appfeed
create table app_feedback(appfeed_id int primary key ,user_id int,appfeed_date datetime,appfeed_desc longtext,appfeed_rating int,foreign key(user_id) references user_login(user_id));

insert into app_feedback values(1,1001,now(),"good application for student ",5);
insert into app_feedback values(2,1002,DATE_ADD(now(), INTERVAL 7 DAY),"very useful for students eho are serching for good college ",4);
insert into app_feedback values(3,1003,DATE_ADD(now(), INTERVAL 10 DAY)," really helpful",5);
insert into app_feedback values(4,1004,DATE_ADD(now(), INTERVAL 3 DAY),"application is seemless",5);
insert into app_feedback values(5,1005,DATE_ADD(now(), INTERVAL 5 DAY),"application is easy to use",3);




#user_login
create table user_login( user_id int primary key , user_name varchar(255),email_id varchar(255),password varchar(255),role varchar(20));

insert into user_login values(1001,"ashish01","ashsih01@gmail.com","1234","student");
insert into user_login values(1002,"gaurav02","gaurav02@gmail.com","1234","HR");
insert into user_login values(1003,"Deepak03","deepak03@gmail.com","1234","Admin");
insert into user_login values(1004,"ruturaj04","ruturaj04@gmail.com","1234","college");
insert into user_login values(1005,"sujit05","sujit05@gmail.com","1234","student");


