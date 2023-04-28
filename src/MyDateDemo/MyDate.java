package com.encora.demo;

public class MyDate {

	private int day;
	private int month;
	private int year;

	public void setMonth(int month) {
		this.month=month;
		if(month>12) {
			this.month=12;
		}else if(month<1) {
			this.month=1;	
		}
	}

	public void setYear(int year) {
		this.year=year;
		if(year<2023) {
			this.year=2023;
		}else if(year>2030){
			this.year=2030;	
		}
	}

	public void setDay(int day, int month, int year) {
		this.day=day;
		if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ) && (day>31)){
			this.day=31;
		}else if((month==4 || month==6 || month==9 || month==11) && (day>30)) {
			this.day=30;
		}else if(day<1) {
			this.day=1;
		}

		if((month==2) && (year%4==0 && year%100!=0 || year%400==0) && (day>29)) {
			this.day=29;
		}else if(month==2 && day>28){
			this.day=28;
		}

	}

	public MyDate(int day,int month,int year) {
		setMonth(month);
		setYear(year);
		setDay(day,month,year);
	}

	@Override
	public String toString() {
		return day+"-"+month+"-"+year;
	}

}
