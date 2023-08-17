drop database  if exists uniguide;

create database uniguide;
use uniguide 


#user_login
create table user_login( user_id int primary key , user_name varchar(255),email_id varchar(255),password varchar(255),role varchar(20));

insert into user_login values(1001,"ashish01","ashsih01@gmail.com","1234","student");
insert into user_login values(1002,"gaurav02","gaurav02@gmail.com","1234","HR");
insert into user_login values(1003,"Deepak03","deepak03@gmail.com","1234","Admin");
insert into user_login values(1004,"ruturaj04","ruturaj04@gmail.com","1234","college");
insert into user_login values(1005,"sujit05","sujit05@gmail.com","1234","student");

#student stud
create table student_login(stud_id int primary key, user_id int , stud_first_name varchar(255), stud_last_name varchar(255), stud_city varchar(255),stud_state varchar(255), stud_qualification varchar(255), stud_entrance_exam varchar(255),stud_exam_score float,clg_id int ,foreign key(user_id) references user_login(user_id),foreign key(clg_id) references college (clg_Id) );

insert into student_login values(1,1001,"Ashish","Mahajan","Pune", "Maharashtra","12th","CET",100);

insert into student_login values(2,1005,"Sujit","Pawar","Pune", "Maharashtra","12th","CET",90);

# university

create table university(uni_id int primary key ,uni_name varchar(255),uni_rank int,uni_address longtext,uni_city varchar(255),uni_state varchar(255),uni_description longtext,uni_img longtext);

insert into university values(1,"Savitribai phule Pune university",35,"Shivaji Nagar","Pune","Maharashtra","It is popularly known as the 'Oxford 
of the East'. It has about 307 recognized research institutes and 612 affiliated 
colleges offering graduate and under-graduate courses. 
The university attracts many foreign students due to its excellent 
facilities. It offers good accommodation facility.",null);

insert into university values(2,"Mumbai university",96,"Mahatma Gandhi road, mantralaya","Mumbai","Maharashtra","The University of Mumbai is a public state
 university in Mumbai. It is one of the largest university systems in the world with over 
 549,000 students on its campuses and affiliated colleges. As of 2013, the university 
 had 711 affiliated colleges. Ratan Tata is the appointed head of the advisory council.",null);



#college  clg
create table college(clg_id int primary key ,uni_id int ,clg_name varchar(255),clg_address longtext,clg_city varchar(255),clg_state varchar(255),clg_website varchar(255),clg_description longtext,clg_img longtext, foreign key(uni_id) references university(uni_id));
insert into college values(1,1,"Rajarshi Shahu College of Engineering","Ashok Nagar, Tathawade","Pune","Maharashtra","www.jspmrscoe.edu.in","Rajarshi Shahu College of Engineering is one among the hallmark institutes of pune, 
established in 2001 with the aim of providing quality technical education and excellence in the ever expanding horizon of technical revolution of 21st century. 
The institute is becoming an icon in the field of engineering education in the state of Maharashtra. It is nurtured and managed by Jayawant Shikshan Prasarak Manadal Trust. 
The Institute is approved by the All India Council for Technical Education (AICTE), New Delhi and Govt. of Maharashtra affiliated to Savitribai Phule Pune University.",null);



insert into college values(2,1,"College of Engineering Pune","Sancheti Hospital, Shivaji nagar","Pune","Maharashtra","www.coep.org.in",
"College of Engineering, Pune (CoEP), chartered in 1854 is a nationally respected leader in technical education. 
The institute is distinguished by its commitment to finding solutions to the great predicaments of the day through advanced technology. 
The institute has a rich history and dedication to the pursuit of excellence. CoEP offers a unique learning experience across a spectrum of academic and social experiences. With a firm footing in truth and humanity, 
the institute gives you an understanding of both technical developments and the ethics that go with it. The curriculum is designed to enhance your academic experience through opportunities like internships, 
study abroad programmes and research facilities. The hallmark of CoEP education is its strong and widespread alumni network, support of the industry and the camaraderie 
that the institute shares with several foreign universities. 
The institute is consistently ranked amongst the top 20 technical colleges in India and its alumni have contributed a lion’s share in development of national infrastructure.",null);

insert into college values(3,1,"Dr. D.Y. Patil College of Engineering","D. Y. Patil
Educational Complex, Sector 29,Akurdi","Pune","Maharashtra","www.dypcoeakurdi.ac.in","Dr. D. Y. Patil Prathishthan's, D.Y. Patil College of Engineering, was established in 1984 in Pimpri and later shifted to Akurdi complex in 2001, which is in the vicinity of Pimpri Chinchwad Industrial area,
 one of the biggest Industrial belts in Asia.
 The college spreads over 10 acres of land with seven Engineering disciplines. This Institute is approved by AICTE, New Delhi and is affiliated to the Savitribai Phule Pune University.
The college has excellent & ambient infrastructure with well-equipped laboratories. Well-qualified, motivated, and dedicated faculty members are serving in the Institute. Students are encouraged to actively participate in National and State level 
co-curricular and extracurricular activities. The institute has well planned boys and girls hostel in the campus with better amenities and ultra-modern facilities",null);


insert into college values(4,1,"BYRAMJEE JEEJEEBHOY GOVERNMENT MEDICAL COLLEGE
AND SASSOON GENERAL HOSPITALs","B.J. Govt. Medical College and Sassoon General Hospitals & College of Nursing
Jai Prakash Narayan Road, Near Pune Railway Station","Pune","Maharashtra","www.bjmcpune.org","Dr. D. Y. Patil Prathishthan's, D.Y. Patil College of Engineering, was established in 1984 in Pimpri and later shifted to Akurdi complex in 2001, which is in the vicinity of Pimpri Chinchwad Industrial area,
 one of the biggest Industrial belts in Asia.
 The college spreads over 10 acres of land with seven Engineering disciplines. This Institute is approved by AICTE, New Delhi and is affiliated to the Savitribai Phule Pune University.
The college has excellent & ambient infrastructure with well-equipped laboratories. Well-qualified, motivated, and dedicated faculty members are serving in the Institute. Students are encouraged to actively participate in National and State level 
co-curricular and extracurricular activities. The institute has well planned boys and girls hostel in the campus with better amenities and ultra-modern facilities",null);

insert into college values(5,1,"Brihan Maharashtra College of Commerce","845, Shivajinagar","Pune","Maharashtra","www.bmcc.ac.in","Deccan Education Society, Pune was established in 1884 and registered on 13th August 1885 and by four patriotic visionaries- Vishnu Shastri Chiplunkar, Bal Gangadhar Tilak, Gopal Ganesh Agarkar and Mahadeo Ballal Namjoshi-who were already recognized as the pioneers of new education in India with the Launch of New English School in Pune in the year 1880. This was a revolutionary step, because in those days Government Institutions and Christian Missionaries were the only agencies involved in educating masses. 
Private enterprise in education was often discouraged. It was also pointed out by these Nationalists that there was no education available to generate leadership, for industrial regeneration of India, or for defense of the motherland i.e. education Required by the people of a self – governing nation. it was the idea of filling these voids that the DES came in to existence. In the view of its founders, Education was the means of rousing-the intellect, the drooping will and the slumbering conscience of their fallen countrymen. They began with a modest aim of facilitating education at low costs by starting schools and colleges.
In the year 1885, the renowned Fergusson College was started. in the year1919, DES established Willingdon College in The southern region of Maharashtra at Sangli on a 125 acre campus. Recognizing the need for commerce Education, 
the society started Brihan Maharashtra College of commerce in 1943 in follwed by Chintamanarao College of Commerce in Sangli in 1960. In the year 1954, Kirti M Doongursee College was established in Mumbai. The Society entered in the field of technical education too with the launch of Technical Institute in Pune (1937). 
DES started management institute viz. IMDR in 1974 at Pune and IMR at Sangli in 1996, the year 2003 witnessed addition of DES Law College and the year 2007 DES started Physiotherapy College. DES also runs an autonomous institute in the field of Vocational Training at Pune. With a view to imparting basic education, the Society has started many schools at various places in the state. The DES management is 
trying to expand its educational activities as per the requirements of the society in general, guided and aided by educationists, visionaries, philanthropists and ex-students, in order to pursue its goal ‘Knowledge is Power’.",null);

insert into college values(6,2,"
    Veermata Jijabai Technological Institute
     (An Autonomous Institute of Government of Maharashtra)","H R Mahajani Rd, Matunga","Mumbai","Maharashtra","www.vjti.ac.in","VJTI Mumbai (estd. in 1887 as Victoria Jubilee Technical Institute) has pioneered India’s Engineering education, research and training ecosystem. Pre-independence, VJTI had been instrumental in driving industrial growth throughout united India. Post-independence, VJTI played a pivotal role in setting up IITs and RECs of India and strengthened technology excellence of country.
    
     In 1997, VJTI changed its name to Veermata Jijabai Technological Institute to honor mother of Chhatrapati Shivaji Maharaj.
     Located in South Mumbai, VJTI is an autonomous institution owned by Maharashtra State Government. The institute offers programs in engineering and technology at the diploma, degree, post-graduate and doctoral levels.
     VJTI is known for its high quality teaching, collaborative research, industry connect and strong alumni network.’.",null);

insert into college values(7,2,"Sardar Patel College of Engineering","Bhavan's Campus, Munshi Nagar, Andheri (West)","Mumbai","Maharashtra","www.spce.ac.in","Sardar Patel College of Engineering is a
    premier Institute established in 1962. It is located in Maharashtra. Institute offers Degree courses including 6 UG and 5 PG courses. These programs are offerred in Full Time mode. Sardar Patel College of Engineering is a well-known institution for B.E. / B.Tech, M.E./M.Tech courses. These programs are delivered by highly experienced faculty. Sardar Patel College of Engineering present collection of courses like B.E. / B.Tech, M.E./M.Tech and Engineering programs. Institute give offer to students to gain proficiency & expertise in the specialization of Civil Engineering, Electrical Engineering, Mechanical Engineering, Construction Engineering, Structural Engineering, Power Engineering. Courses offered by institute are recognized and acknowlegded by approving bodies like AICTE. Courses offered by the Institute for total of 270 students. Courses offered by Sardar Patel College of Engineering are in the fee range of INR 120,000-338,800 for a total of 270 candidates. College provides good facilities and infrastructure like Auditorium, Boys Hostel, Cafeteria, Girls Hostel, Gym, Hospital / Medical Facilities, Hostel, Labs,
      Library, Sports Complex, Wi-Fi Campusto the students.",null);
 
insert into college values(8,2,"St. Xavier's College Mumbai","5,Mahapalika Marg","Mumbai","Maharashtra","www.xaviers.ac","St. Xavier’s College in Mumbai is a private roman catholic college affiliated with the University of Mumbai. The college has been ranked as India’s No.1 private autonomous college by Education World for the second year in a row.

The college offers Undergraduate, Postgraduate, Certificate, and Diploma programs in the fields of Arts, Science, Business, and Commerce. Admission to these courses is both merit and entrance-based. The cut-off for the entrance exam conducted by the college ranges between 92-98 percentile for the general category students. Check St. Xavier’s Admission

St. Xavier’s also provides great placement opportunities to its students. In the recent placement drive of 2020, the college witnessed significant growth in the number of placement offers. The highest salary package has touched INR 30 LPA mark. Some of the key recruiting associated with college are Accenture, 
Axis Bank, Crisil, Mahindra & Mahindra, SAP, and many more like them.",null);

 
insert into college values(9,2,"Grant Medical College & Sir J.J. Group Of Hospitals","GGMC JJH Group of Hospitals J. J. Marg, Nagpada-Mumbai Central, Off Jejeebhoy Road","Mumbai","Maharashtra","www.ggmcjjh.com","Grant Govt. Medical College & Sir J. J. Group of Hospitals Mumbai stands apart amongst all the medical colleges in Maharashtra because of its unique topography, connectivity and persistent leadership in medical training and health care for common man over the past one and a half-century.
Grant Medical College & Sir J. J. Group of Hospitals Mumbai is a premier and pioneer medical institution of 175 years of existence. This oldest medical institution run by the Government of Maharashtra providing undergraduate and postgraduate medical training and health care ranging from specialties to super-specialties along with tertiary care to patients will provide enhanced standards of medical education and health care.
Grant Medical College & Sir J. J. Group of Hospitals has situated the territory of south and central Mumbai. Mumbai is well connected by Western and Central railway, roadways, and airways and even by sea from all the parts of Maharashtra, India & the world.",null);

insert into college values(10,2,"Government Law College, Mumbai","Government Law College 'A' Road, ChurchGate","Mumbai","Maharashtra","www.glcmumbai.com","Government Law College (GLC), established in 1855, has the distinction of being the oldest Law College in Asia, dating even prior to the University of Mumbai, and enjoys a pre-eminent reputation for excellence in the field of legal education.
Government Law College or GLC, as it is popularly known, continues to be an institution exclusively for the students of law. In addition to the old building, the college now has an annexe building, September 1988 onwards, which houses additional class rooms and a reference library.
GLC, which has a rich heritage and pedigree, is the repository of erudition in the legal firmament and has had the privilege of guidance and tutelage under eminent legal luminaries such as Dr. B. R. Ambedkar, Lokmanya Tilak, Justice M. C. Chagla, Sir Motilal Setalvad (first Attorney General of India), Sir Dinshaw Mulla, Justice Y. V. Chandrachud, Mr. Nani Palkhivala and several others who have adorned benches of the Supreme Court of India and the Bombay High Court. The students who have passed out from the portals of GLC have distinguished themselves at the Bar, the Judiciary and the Academe. From these portals, have passed the likes of five Chief Justices of the Supreme Court of India, Ms.Pratibha Devisingh Patil, former President of India, and Mr. Lal Krishna Advani, former deputy Prime Minister of India. The College takes great pride in being the alma mater of India's most prominent Supreme Court and High Court judges who have pronounced the greatest of judgments and legal doctrines that revolutionised the legal environment. Most of the top notch Counsels and Legal Practitioners who virtually built and rule the entire paradigm of India's legal profession have also passed through the portals of this great institution.
The College derives its strength and ethos from the highly qualified and dedicated faculty. The college has the unique and proud privilege of intimate association with prominent legal professionals of distinction as visiting faculty who regularly conduct lectures, workshops and discussions with students despite their hectic schedules and preoccupations.",null);


#stream strm
create table stream(strm_id int primary key ,strm_name varchar(255),strm_scope longtext);

insert into stream values(1,"BBA","The esteemed job profoles that are offered are Human Resource manager, Finance Manager, Business consultant, Marketing manager. Some graduates can get placed in Financial Institutes, Marketing Organisations, Business Consultancies, and educational institutes with high packages.");

insert into stream values(2,"BEM","Event management is a thriving industry in India with immense career opportunities. Whether you are interested in planning weddings, corporate events or music concerts, the scope of work is vast and exciting. Can get roles like Resort general manager,Sales director
Meeting planner,Event marketing manager,Wedding planner,Tourism manager");

insert into stream values(3,"BFD","On completion of BFD, students can opt for a wide range of jobs including Costume Designer, Stylist, Trend Forecaster, Fashion Designer, Product Developer among numerous others. This course allows the students to work in the glamorous world of the fashion industry, providing the average salary package of INR 2-9 lakh");

insert into stream values(4,"BTech","In the future, the B. Tech CSE students will be at the top of the job market with their highly sought-after skills and knowledge. Hence, students can depend on the graduates to become successful in the long run");

insert into stream values(5,"BArch","BArch is a course that comes with a lot of opportunities. Some of the top job profiles that consist of the BArch graduates are Design Architect, Project Assistant, Project Architect, Interior Designer, Urban Planner, etc");

insert into stream values(6,"BCA","A BCA graduate has a great scope in jobs as a Web Designer, System Manager, Software Developer, Computer Programmer, Web Developer, Software Developer, software tester, etc. depending on the skills acquired by the student at the time of BCA.");

insert into stream values(7,"BSc","Some popular job roles include physics professor, physicist, research scientist, biophysicist, natural science expert, research faculty, subject-matter expert and nanotechnologist. These jobs are sought after and well paid");

insert into stream values(8,"MBBS","MBBS candidates can also pursue careers in other sectors besides hospitals. Some of the industries which are flourishing nowadays are mentioned below. Government Sector: There are endless government jobs for MBBS graduates be it teaching or defence.");

insert into stream values(9,"LLB","After earning a degree in corporate law, students can find work in law firms, banks, insurers, asset managers, and other organisations. If they choose to teach, they can become or be hired as a Teacher or Lecturer at colleges or universities after earning a master's degree in business law");


#branch brch 
create table branch(brch_id int primary key,brch_name varchar(255), brch_duration varchar(255));

insert into branch values(1,"Mechanical Engineering","4 years");

insert into branch values(2,"Computer Engineering","4 years");

insert into branch values(3,"Civil Engineering","4 years");

insert into branch values(4,"Computer Science","3 years");

insert into branch values(5,"Physics","3 years");

insert into branch values(6,"Mathematics","3 years");

insert into branch values(7,"Urban Planning","3-4 years");

insert into branch values(8,"Interior","4 years");

insert into branch values(9,"Design","4 years");

insert into branch values(10,"BDS","5.5 years");

insert into branch values(11,"BAMS","5.5 years");

#ranking rnk
create table ranking(rnk_id int primary key ,clg_id int,strm_id int, nirf_rank int,foreign key(strm_id) references stream(strm_id),foreign key(clg_id) references college(clg_id));

insert into ranking values(1,1,4,170);

insert into ranking values(2,2,4,72);

insert into ranking values(3,3,4,192);

insert into ranking values(4,4,8,15);

insert into ranking values(5,5,1,27);

insert into ranking values(6,6,4,127);

insert into ranking values(7,7,4,167);

insert into ranking values(8,4,1,5);

insert into ranking values(9,9,8,41);

insert into ranking values(10,10,9,27);




#intake_vacancy inv
create table intake_vacancy(invc_id int primary key ,clg_id int ,strm_id int ,brch_id int ,invc_seats int,invc_fee varchar(255),invc_documents varchar(255),invc_vacancy int,foreign key(clg_id) references college(clg_id),foreign key(brch_id) references branch(brch_id),foreign key(strm_id) references stream(strm_id));

insert into intake_vacancy values(1,1,4,1,240,110000,"10th result, 12th result, aadhar card",120);

insert into intake_vacancy values(2,1,4,2,120,115000,"10th result, 12th result, aadhar card",40);

insert into intake_vacancy values(3,2,4,1,180,90000,"10th result, 12th result, aadhar card",50);

insert into intake_vacancy values(4,4,4,2,120,90000,"10th result, 12th result, aadhar card",10);

insert into intake_vacancy values(5,9,8,10,200,85000,"10th result, 12th result, aadhar card",120);

insert into intake_vacancy values(6,9,8,11,300,155000,"10th result, 12th result, aadhar card",150);


#College_predictor clgpr
create table college_predictor(clgpr_id int primary key ,clg_id int ,strm_id int ,brch_id int ,clgpr_entrance_exam varchar(255),clgpr_y1 float,clgpr_y2 float,clgpr_y3 float,clgpr_y4 float,clgpr_y5 float,clgpr_average float GENERATED ALWAYS as ((clgpr_y1*0.2+clgpr_y2*0.4+clgpr_y3*0.6+clgpr_y4*0.8+clgpr_y5)/3),foreign key(clg_id) references college(clg_id),foreign key(brch_id) references branch(brch_id),foreign key(strm_id) references stream(strm_id));

insert into college_predictor values(1,1,4,1,"CET",80,84.2,78.2,81.3,84.6,default);

insert into college_predictor values(2,1,4,1,"JEE",60,62.2,68.2,60.3,64.6,default);

insert into college_predictor values(3,9,8,10,"NEET",680,684,640,604,600,default);

insert into college_predictor values(4,4,8,11,"NEET",580,584,500,500,496,default);

insert into college_predictor values(5,5,7,4,"12th percentage",65,64.2,62.2,61.3,68.6,default);


#feedback feed
create table feedback(feed_id int primary key ,stud_id int,clg_id int ,feed_date datetime,feed_desc longtext,feed_rating int,foreign key(stud_id) references student_login(stud_id),foreign key(clg_id) references college(clg_id));

insert into feedback values(1,1,1,now(),"Very good college, having plenty of placement opportunities",8);

insert into feedback values(2,2,2,now(),"average college, good infrastructure",6);




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


#Community

create table student_community(comm_id int, stud_id int, comm_ask longtext, comm_ask_type varchar(50),comm_ask_date datetime, foreign key(stud_id) references student_login(stud_id));

insert into student_community values(1,1,"What are the assosciations for mechanical engineering","question",  now());
insert into student_community values(2,2,"Society for Automotive Engineers,ISHRAE","Answer",date_add(now(),INTERVAL 2 day));