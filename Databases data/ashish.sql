
#college  clg
create table college(clg_id int primary key ,uni_id int ,clg_name varchar(255),clg_address longtext,clg_city varchar(255),clg_state varchar(255),clg_website varchar(255),clg_description longtext,clg_img longtext, foreign key(uni_id) references university(uni_id));
insert into college values(1,"Ashok Nagar, Tathawade","Pune","Rajarshi Shahu College of Engineering is one among the hallmark institutes of pune,established in 2001 with the aim of providing quality technical education and excellence in the ever expanding horizon of technical revolution of 21st century.",null,"Rajarshi Shahu College of Engineering","Maharashtra","www.jspmrscoe.edu.in",1);





insert into college values(2,"Sancheti Hospital Shivaji nagar", "Pune","College of Engineering, Pune (CoEP), chartered in 1854 is a nationally respected leader in technical education. 
The institute is distinguished by its commitment to finding solutions to the great predicaments of the day through advanced technology. 
The institute has a rich history and dedication to the pursuit of excellence. CoEP offers a unique learning experience across a spectrum of academic and social experiences. With a firm footing in truth and humanity, 
the institute gives you an understanding of both technical developments and the ethics that go with it. The curriculum is designed to enhance your academic experience through opportunities like internships, 
study abroad programmes and research facilities. The hallmark of CoEP education is its strong and widespread alumni network, support of the industry and the camaraderie 
that the institute shares with several foreign universities. The institute is consistently ranked amongst the top 20 technical colleges in India and its alumni have contributed a lion’s share in development of national infrastructure.",
null,"College of Engineering Pune","Maharashtra","www.coep.org.in",1);





insert into college values(3,
"D. Y. Patil Educational Complex, Sector 29,Akurdi","Pune","Dr. D. Y. Patil Prathishthan's, D.Y. Patil College of Engineering, was established in 1984 in Pimpri and later shifted to Akurdi complex in 2001, which is in the vicinity of Pimpri Chinchwad Industrial area,
 one of the biggest Industrial belts in Asia.
 The college spreads over 10 acres of land with seven Engineering disciplines. This Institute is approved by AICTE, New Delhi and is affiliated to the Savitribai Phule Pune University.
The college has excellent & ambient infrastructure with well-equipped laboratories. Well-qualified, motivated, and dedicated faculty members are serving in the Institute. Students are encouraged to actively participate in National and State level 
co-curricular and extracurricular activities. The institute has well planned boys and girls hostel in the campus with better amenities and ultra-modern facilities",
null,"Dr. D.Y. Patil College of Engineering","Maharashtra","www.dypcoeakurdi.ac.in",1);



insert into college values(4,"B.J. Govt. Medical College and Sassoon General Hospitals & College of Nursing
Jai Prakash Narayan Road, Near Pune Railway Station","Pune","Dr. D. Y. Patil Prathishthan's, D.Y. Patil College of Engineering, was established in 1984 in Pimpri and later shifted to Akurdi complex in 2001, which is in the vicinity of Pimpri Chinchwad Industrial area,
 one of the biggest Industrial belts in Asia.
 The college spreads over 10 acres of land with seven Engineering disciplines. This Institute is approved by AICTE, New Delhi and is affiliated to the Savitribai Phule Pune University.
The college has excellent & ambient infrastructure with well-equipped laboratories. Well-qualified, motivated, and dedicated faculty members are serving in the Institute. Students are encouraged to actively participate in National and State level 
co-curricular and extracurricular activities. The institute has well planned boys and girls hostel in the campus with better amenities and ultra-modern facilities",
null,"BYRAMJEE JEEJEEBHOY GOVERNMENT MEDICAL COLLEGE
AND SASSOON GENERAL HOSPITALs","Maharashtra","www.bjmcpune.org",1);


  

insert into college values(5,"845, Shivajinagar","Pune","Deccan Education Society, Pune was established in 1884 and registered on 13th August 1885 and by four patriotic visionaries- Vishnu Shastri Chiplunkar, Bal Gangadhar Tilak, Gopal Ganesh Agarkar and Mahadeo Ballal Namjoshi-who were already recognized as the pioneers of new education in India with the Launch of New English School in Pune in the year 1880. This was a revolutionary step, because in those days Government Institutions and Christian Missionaries were the only agencies involved in educating masses. 
Private enterprise in education was often discouraged. It was also pointed out by these Nationalists that there was no education available to generate leadership, for industrial regeneration of India, or for defense of the motherland i.e. education Required by the people of a self – governing nation. it was the idea of filling these voids that the DES came in to existence. In the view of its founders, Education was the means of rousing-the intellect, the drooping will and the slumbering conscience of their fallen countrymen. They began with a modest aim of facilitating education at low costs by starting schools and colleges.
In the year 1885, the renowned Fergusson College was started. in the year1919, DES established Willingdon College in The southern region of Maharashtra at Sangli on a 125 acre campus. Recognizing the need for commerce Education, 
the society started Brihan Maharashtra College of commerce in 1943 in follwed by Chintamanarao College of Commerce in Sangli in 1960. In the year 1954, Kirti M Doongursee College was established in Mumbai. The Society entered in the field of technical education too with the launch of Technical Institute in Pune (1937). 
DES started management institute viz. IMDR in 1974 at Pune and IMR at Sangli in 1996, the year 2003 witnessed addition of DES Law College and the year 2007 DES started Physiotherapy College. DES also runs an autonomous institute in the field of Vocational Training at Pune. With a view to imparting basic education, the Society has started many schools at various places in the state. The DES management is 
trying to expand its educational activities as per the requirements of the society in general, guided and aided by educationists, visionaries, philanthropists and ex-students, in order to pursue its goal ‘Knowledge is Power’.",
null,"Brihan Maharashtra College of Commerce","Maharashtra","www.bmcc.ac.in", 1);




insert into college values(6,"H R Mahajani Rd, Matunga","Mumbai","VJTI Mumbai (estd. in 1887 as Victoria Jubilee Technical Institute) has pioneered India’s Engineering education, research and training ecosystem. Pre-independence, VJTI had been instrumental in driving industrial growth throughout united India. Post-independence, VJTI played a pivotal role in setting up IITs and RECs of India and strengthened technology excellence of country.
     In 1997, VJTI changed its name to Veermata Jijabai Technological Institute to honor mother of Chhatrapati Shivaji Maharaj.
     Located in South Mumbai, VJTI is an autonomous institution owned by Maharashtra State Government. The institute offers programs in engineering and technology at the diploma, degree, post-graduate and doctoral levels.
     VJTI is known for its high quality teaching, collaborative research, industry connect and strong alumni network.’.",null,"
    Veermata Jijabai Technological Institute
     (An Autonomous Institute of Government of Maharashtra)","Maharashtra","www.vjti.ac.in",2);




insert into college values(7,"Bhavan's Campus, Munshi Nagar, Andheri (West)","Mumbai","Sardar Patel College of Engineering is a
    premier Institute established in 1962. It is located in Maharashtra. Institute offers Degree courses including 6 UG and 5 PG courses. These programs are offerred in Full Time mode. Sardar Patel College of Engineering is a well-known institution for B.E. / B.Tech, M.E./M.Tech courses. These programs are delivered by highly experienced faculty. Sardar Patel College of Engineering present collection of courses like B.E. / B.Tech, M.E./M.Tech and Engineering programs. Institute give offer to students to gain proficiency & expertise in the specialization of Civil Engineering, Electrical Engineering, Mechanical Engineering, Construction Engineering, Structural Engineering, Power Engineering. Courses offered by institute are recognized and acknowlegded by approving bodies like AICTE. Courses offered by the Institute for total of 270 students. Courses offered by Sardar Patel College of Engineering are in the fee range of INR 120,000-338,800 for a total of 270 candidates. College provides good facilities and infrastructure like Auditorium, Boys Hostel, Cafeteria, Girls Hostel, Gym, Hospital / Medical Facilities, Hostel, Labs,
      Library, Sports Complex, Wi-Fi Campusto the students.",null,
"Sardar Patel College of Engineering","Maharashtra","www.spce.ac.in",2);




 
insert into college values(8,"5,Mahapalika Marg","Mumbai","St. Xavier’s College in Mumbai is a private roman catholic college affiliated with the University of Mumbai. The college has been ranked as India’s No.1 private autonomous college by Education World for the second year in a row.

The college offers Undergraduate, Postgraduate, Certificate, and Diploma programs in the fields of Arts, Science, Business, and Commerce. Admission to these courses is both merit and entrance-based. The cut-off for the entrance exam conducted by the college ranges between 92-98 percentile for the general category students. Check St. Xavier’s Admission

St. Xavier’s also provides great placement opportunities to its students. In the recent placement drive of 2020, the college witnessed significant growth in the number of placement offers. The highest salary package has touched INR 30 LPA mark. Some of the key recruiting associated with college are Accenture, 
Axis Bank, Crisil, Mahindra & Mahindra, SAP, and many more like them."
,null,"St. Xavier's College Mumbai","Maharashtra","www.xaviers.ac",2);

 
 
 
insert into college values(9,"GGMC JJH Group of Hospitals J. J. Marg, Nagpada-Mumbai Central, Off Jejeebhoy Road","Mumbai","Grant Govt. Medical College & Sir J. J. Group of Hospitals Mumbai stands apart amongst all the medical colleges in Maharashtra because of its unique topography, connectivity and persistent leadership in medical training and health care for common man over the past one and a half-century.
Grant Medical College & Sir J. J. Group of Hospitals Mumbai is a premier and pioneer medical institution of 175 years of existence. This oldest medical institution run by the Government of Maharashtra providing undergraduate and postgraduate medical training and health care ranging from specialties to super-specialties along with tertiary care to patients will provide enhanced standards of medical education and health care.
Grant Medical College & Sir J. J. Group of Hospitals has situated the territory of south and central Mumbai. Mumbai is well connected by Western and Central railway, roadways, and airways and even by sea from all the parts of Maharashtra, India & the world.",
null,"Grant Medical College & Sir J.J. Group Of Hospitals","Maharashtra","www.ggmcjjh.com",2);




insert into college values(10,"Government Law College 'A' Road, ChurchGate","Mumbai","Government Law College (GLC), established in 1855, has the distinction of being the oldest Law College in Asia, dating even prior to the University of Mumbai, and enjoys a pre-eminent reputation for excellence in the field of legal education.
Government Law College or GLC, as it is popularly known, continues to be an institution exclusively for the students of law. In addition to the old building, the college now has an annexe building, September 1988 onwards, which houses additional class rooms and a reference library.
GLC, which has a rich heritage and pedigree, is the repository of erudition in the legal firmament and has had the privilege of guidance and tutelage under eminent legal luminaries such as Dr. B. R. Ambedkar, Lokmanya Tilak, Justice M. C. Chagla, Sir Motilal Setalvad (first Attorney General of India), Sir Dinshaw Mulla, Justice Y. V. Chandrachud, Mr. Nani Palkhivala and several others who have adorned benches of the Supreme Court of India and the Bombay High Court. The students who have passed out from the portals of GLC have distinguished themselves at the Bar, the Judiciary and the Academe. From these portals, have passed the likes of five Chief Justices of the Supreme Court of India, Ms.Pratibha Devisingh Patil, former President of India, and Mr. Lal Krishna Advani, former deputy Prime Minister of India. The College takes great pride in being the alma mater of India's most prominent Supreme Court and High Court judges who have pronounced the greatest of judgments and legal doctrines that revolutionised the legal environment. Most of the top notch Counsels and Legal Practitioners who virtually built and rule the entire paradigm of India's legal profession have also passed through the portals of this great institution.
The College derives its strength and ethos from the highly qualified and dedicated faculty. The college has the unique and proud privilege of intimate association with prominent legal professionals of distinction as visiting faculty who regularly conduct lectures, workshops and discussions with students despite their hectic schedules and preoccupations.",

null,"Government Law College, Mumbai","Maharashtra","www.glcmumbai.com",2);



#ApplicationFeedback appfeed
create table app_feedback(appfeed_id int primary key ,user_id int,appfeed_date datetime,appfeed_desc longtext,appfeed_rating int,foreign key(user_id) references user_login(user_id));

insert into app_feedback values(1,now(),"good application for student ",5,51001);
insert into app_feedback values(2,DATE_ADD(now(), INTERVAL 7 DAY),"very useful for students eho are serching for good college ",4,1002);
insert into app_feedback values(3,DATE_ADD(now(), INTERVAL 10 DAY)," really helpful",5,1003);
insert into app_feedback values(4,DATE_ADD(now(), INTERVAL 3 DAY),"application is seemless",5,1004);
insert into app_feedback values(5,DATE_ADD(now(), INTERVAL 5 DAY),"application is easy to use",3,1005);





insert into branch values(1,"4 years","Mechanical Engineering");
insert into branch values(2,"4 years","Computer Engineering");
insert into branch values(3,"4 years","Civil Engineering");
insert into branch values(4,"3 years","Computer Science");
insert into branch values(5,"3 years","Physics");
insert into branch values(6,"3 years","Mathematics");
insert into branch values(7,"3-4 years","Urban Planning");
insert into branch values(8,"4 years","Interior");
insert into branch values(9,"4 years","Design");
insert into branch values(10,"5.5 years","BDS");
insert into branch values(11,"5.5 years","BAMS");
















