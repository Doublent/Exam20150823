package com.hand.bean;

public class Member{
	String logname,email,phone,message,picture,backNews; 

	public void setLogname(String logname){
		this.logname = logname;
	}
	public String getLogname(){
		return logname;
	}

	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	
	public void setMessage(String message){
		this.message = message;
	} 
	public String getMessage(){
		return message;
	} 
	
	public void setPicture(String picture){
		this.picture = picture;
	} 
	public String getPicture(){
		return picture;
	}
	
	public void setBackNews(String backNews){
		this.backNews = backNews;
	} 
	public String getBackNews(){
		return backNews;
	}
	
}