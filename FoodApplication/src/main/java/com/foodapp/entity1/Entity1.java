package com.foodapp.entity1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entity1 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int user_id;
	private String user_name;
	private String user_password;
	private String retype_password;
	private long mobile_number;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getRetype_password() {
		return retype_password;
	}

	public void setRetype_password(String retype_password) {
		this.retype_password = retype_password;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public Entity1(int user_id, String user_name, String user_password, String retype_password, long mobile_number) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.retype_password = retype_password;
		this.mobile_number = mobile_number;
	}

	public Entity1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Entity1 [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", retype_password=" + retype_password + ", mobile_number=" + mobile_number + "]";
	}

}
