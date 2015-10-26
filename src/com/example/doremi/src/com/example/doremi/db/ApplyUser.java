package com.example.doremi.db;

public class ApplyUser {
	private int id;
	private String name;
	private String phone;
	private String age;
	private char sex;
	public ApplyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplyUser(String name, String phone,String age,char sex) {
		super();
		this.name = name;
		this.phone = phone;
		this.age=age;
		this.sex = sex;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return name;
	}
	public void setUsername(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
		}
    public void setSex(char sex) {
		this.sex = sex;
		}

	public String toString() {
		return  this.name+","+this.phone+","+this.age+","
				+this.sex;
	}

}
