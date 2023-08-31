create table temp(id int primary key auto_increment, qty int, dates datetime);

delimiter //

Drop Event if exists Log_qty;
Drop Event if exists Log_qtys;

CREATE EVENT LOG_QTY ON SCHEDULE EVERY 24 HOUR
DO 
	BEGIN 
		delete from app_feedback where appfeed_date <(now());
	end; //
	
delimiter ;
   
   
 delimter //
CREATE EVENT LOG_QTYs ON SCHEDULE EVERY 24 hour
DO 
	BEGIN
		delete from event where  evt_schedule_on <(now());
	END;//
   
   delimiter ;
   
 #ALTER EVENT log_qty DISABLE;   
 #ALTER EVENT log_qty ENABLE;
	
	
	

   