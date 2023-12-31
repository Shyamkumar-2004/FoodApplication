package com.foodapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entityclass {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int user_id;
	private String user_name;
	private String user_password;

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

	public Entityclass(int user_id, String user_name, String user_password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
	}

	public Entityclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Entityclass [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ "]";
	}

}
