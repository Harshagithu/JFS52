package com.codegnan.data;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date=new Date(System.currentTimeMillis());
        System.out.println("Using Date class: "+date);

        DateFormat df = DateFormat.getDateInstance();
        System.out.println("Using DateFormat class: "+df.format(date));

        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Using SimpleDateFormat class: "+sdf.format(date));

        // classes introduced in java 8
        System.out.println("Local date: "+LocalDate.now());
        System.out.println("Local time: "+LocalTime.now());
        System.out.println("Local Date and Time: "+LocalDateTime.now());
        
        
	}

}
