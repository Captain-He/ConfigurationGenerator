DROP PROCEDURE if exists autodeletedata;
DELIMITER //
CREATE PROCEDURE autodeletedata(IN p_in int)       
BEGIN
    DECLARE endtime_var varchar(50); 
    DECLARE endtime int; 
    DECLARE datanumber int;
    DECLARE limitnumber int;
    
    select date_sub(now(),interval p_in minute) into endtime_var from dual;
    select unix_timestamp(endtime_var) into endtime;
		
		# for speed
		set limitnumber=10000;
		
		select count(*) into datanumber FROM sensordata
			where  samplingTime/1000 < endtime;
		while datanumber > limitnumber do 
		   delete FROM sensordata order by sensordataID asc limit limitnumber;
		   set datanumber = datanumber - limitnumber;
		end while;
		delete FROM sensordata order by sensordataID asc limit datanumber;		select count(*) into datanumber FROM XG_TS_BT
			where  samplingTime/1000 < endtime;
		
		while datanumber > limitnumber do 
		   delete FROM XG_TS_BT order by sensordataID asc limit limitnumber;
		   set datanumber = datanumber - limitnumber;
		end while;
		delete FROM XG_TS_BT order by sensordataID asc limit datanumber;		select count(*) into datanumber FROM XG_YG_BT
			where  samplingTime/1000 < endtime;
		
		while datanumber > limitnumber do 
		   delete FROM XG_YG_BT order by sensordataID asc limit limitnumber;
		   set datanumber = datanumber - limitnumber;
		end while;
		delete FROM XG_YG_BT order by sensordataID asc limit datanumber;		select count(*) into datanumber FROM XG_WS_BT
			where  samplingTime/1000 < endtime;
		
		while datanumber > limitnumber do 
		   delete FROM XG_WS_BT order by sensordataID asc limit limitnumber;
		   set datanumber = datanumber - limitnumber;
		end while;
		delete FROM XG_WS_BT order by sensordataID asc limit datanumber;		select count(*) into datanumber FROM XG_SJ_BT
			where  samplingTime/1000 < endtime;
		
		while datanumber > limitnumber do 
		   delete FROM XG_SJ_BT order by sensordataID asc limit limitnumber;
		   set datanumber = datanumber - limitnumber;
		end while;
		delete FROM XG_SJ_BT order by sensordataID asc limit datanumber;		select count(*) into datanumber FROM XG_MC_BT
			where  samplingTime/1000 < endtime;
		
		while datanumber > limitnumber do 
		   delete FROM XG_MC_BT order by sensordataID asc limit limitnumber;
		   set datanumber = datanumber - limitnumber;
		end while;
		delete FROM XG_MC_BT order by sensordataID asc limit datanumber;		select count(*) into datanumber FROM XG_SW_BT
			where  samplingTime/1000 < endtime;
		
		while datanumber > limitnumber do 
		   delete FROM XG_SW_BT order by sensordataID asc limit limitnumber;
		   set datanumber = datanumber - limitnumber;
		end while;
		delete FROM XG_SW_BT order by sensordataID asc limit datanumber;		select count(*) into datanumber FROM XG_CS_BT
			where  samplingTime/1000 < endtime;
		
		while datanumber > limitnumber do 
		   delete FROM XG_CS_BT order by sensordataID asc limit limitnumber;
		   set datanumber = datanumber - limitnumber;
		end while;
		delete FROM XG_CS_BT order by sensordataID asc limit datanumber;END //

DELIMITER ;
