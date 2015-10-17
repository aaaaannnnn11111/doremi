package com.example.drm123;

public class User {
	private int id;
	private String useremail;
	private String password;
	private String name;
	private int age;
	private String sex;
	private String telephone;
	public int getId() {
		return id;
	}
	
	public User() {
		super();
		this.useremail = useremail;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.name=name;
		this.telephone=telephone;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "User [id=" + id + ", useremail=" + useremail + ", password="
				+ password + ",name="+name+", age=" + age + ", sex=" + sex + ",telephone="+telephone+"]";
	}
}
