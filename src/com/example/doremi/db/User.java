package com.example.doremi.db;


import java.io.Serializable;

public class User implements Serializable{
	private int id;
	private String username;
	private String password;
	private char sex;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password,char sex) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getSex() {
		return sex;
		}
    public void setSex(char sex) {
		this.sex = sex;
		}

	public String toString() {
		return  this.username+","+this.password+","
				+this.sex;
	}
	
}
