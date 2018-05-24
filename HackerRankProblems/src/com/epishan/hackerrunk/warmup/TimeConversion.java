package com.epishan.hackerrunk.warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class TimeConversion {
	DateFormat df12, df24;
	Date date;
	
	TimeConversion (String time) throws ParseException {
		this.df12 =  new SimpleDateFormat("hh:mm:ssa");
		this.date = this.df12.parse(time);
	}
	
	public void printTime() {
		this.df24 = new SimpleDateFormat("HH:mm:ss");
		System.out.println(this.df24.format(this.date));
	}
}
